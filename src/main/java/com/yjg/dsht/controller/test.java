package com.yjg.dsht.controller;

//import com.yjg.dsht.redis.Redis;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.yjg.dsht.entity.User;
import com.yjg.dsht.redis.RedisUtil;
import com.yjg.dsht.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;

public class test {
    public static void main(String[] args) {
//        Jedis jedis = RedisUtil.getJedis();
//
//
//        jedis.set("zwb","123");
//
//        String a=jedis.get("zwb");
//        System.out.println(a);
//        jedis.hset("username","zwb","123");
//        if (jedis.hexists("username","zwb")) {
//            if (jedis.get("zwb").equals("123")) {
//                //登录成功
//                System.out.println("1");
//            } else {
//
//                System.out.println("0");
//            }
//            }else {
//        System.out.println("3");}
//        }




//        Jedis redis=new Jedis();
//
//        redis.set("zwb","123");
//
//        String a=redis.get("zwb");
//        System.out.println(a);
//        redis.hset("username","zwb","123");
//        if (redis.hexists("username","zwb")) {
//            if (redis.get("zwb").equals("123")) {
//                //登录成功
//                System.out.println("1");
//            } else {
//
//                System.out.println("0");
//            }
//            }else {
//        System.out.println("3");}


        UserService userService = new UserService();


//         user = userService.findTopByUserid();

//        System.out.println(user.getClass());

//        System.out.println(user);


//        String sql=""
    }

}
