package com.yjg.dsht.controller;

import com.yjg.dsht.entity.User;
//import com.yjg.dsht.redis.Redis;
import com.yjg.dsht.redis.RedisUtil;
import com.yjg.dsht.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;


@Controller

@RequestMapping
public class UserController {
    @Autowired

    private UserService userService;
    Object user;

    /**
     * 欢迎页面
     *
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /**
     * 登录页面
     *
     * @return
     */
    @RequestMapping("/login")
    public String login() {

        return "login";
    }

    /**
     * 主页面
     *
     * @return
     */

    @RequestMapping("/dashboard")
    public String dashboard() {

        return "main";
    }

    @RequestMapping("/emp")
    public String toAddPage() {

        return "main";
    }

    @RequestMapping("/look")
    public String LOOKPage() {
        return "add";
    }

    /**
     * 用户信息列表页面
     *
     * @return
     */
    @RequestMapping("/lists")
    public String list(ModelMap modelMap) {
        user = userService.findAll();
        modelMap.addAttribute("list", user);
        return "look";

    }

    /**
     * 去注册页面
     *
     * @return
     */
    @RequestMapping("/register")
    public String register() {

        return "register";
    }

    /**
     * 执行注册 成功后登录页面 否则调回注册页面
     *
     * @param request
     * @param user
     * @return
     */
    @RequestMapping("/doregister")
    public String register(HttpServletRequest request, User user) {

        Jedis jedis = RedisUtil.getJedis();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
        if (password.equals(password2)) {
            if (registerUser(username) == true) {
                User user1 = new User();
                user1.setUsername(username);
                user1.setPassword(password);
                userService.save(user1);

                jedis.set(username, password);
                jedis.hset("username",username,password);

                return "login";
            } else {
                return "register";
            }
        } else {
            return "register";
        }
    }

    public Boolean registerUser(String username) {
        Boolean a = true;
        if (userService.findByName(username).isEmpty()) {
            return a;
        } else {
            return false;
        }
    }

    /**
     * 执行登录
     *
     * @param request
     * @return
     */
    @RequestMapping("/dologin")
    public String dologin(HttpServletRequest request, User user,User user1,
                          Map<String, Object> map,
                          HttpSession session) {

        Jedis jedis = RedisUtil.getJedis();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        user = userService.FindNameAndPsw(username, password);

        user1=userService.findmaxid();

        Integer maxid=user1.getUserid();



        if (jedis.hexists("username",username)) {
            if (jedis.get(username).equals(password)) {
                //登录成功
                session.setAttribute("loginUser",username);
                session.setAttribute("maxId",maxid);

                return "redirect:/ok.html";
            }
            else {
                    // return密码错误;
                    map.put("msg", "用户名密码错误");
                    return "login";
                }
        }
        else {
            if (user != null) {
                //登录成功
            session.setAttribute("loginUser",username);

            return "redirect:/ok.html";
            }
            else {
                map.put("msg", "账号不存在");
                 System.out.println("不存在");
                return "login";
            }
        }
    }


    /**
     * TEST
     * */

}