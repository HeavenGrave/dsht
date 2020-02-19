package com.yjg.dsht.controller;

import com.yjg.dsht.dao.GoodsDao;
import com.yjg.dsht.entity.Goods;
import com.yjg.dsht.redis.RedisUtil;
import com.yjg.dsht.service.GoodsService;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import java.nio.channels.FileChannel;


@Controller
@RequestMapping
public class GoodsController {

    @Autowired
    private GoodsService goodsService;
    Object goods;
    Object goods1;
    Object goods2;

    @RequestMapping("/list")
    public String List() {
        return "list";
    }

    @RequestMapping("/addg")
    public String Addgs() {

        return "addg";
    }

    @RequestMapping("/glist")
    public String Glist(ModelMap modelMap) {
        goods = goodsService.findAll();
        modelMap.addAttribute("glist", goods);

        return "addgoos";
    }
    @RequestMapping("/doaddg")
    public String Doaddg(  HttpServletRequest request, Goods goods) {

            String goodsname= request.getParameter( "goodsname");
            String goodsprice= request.getParameter("goodsprice");
            String goodsfakeprice = request.getParameter("goodsfakeprice");
            String goodstype = request.getParameter("goodstype");
            String goodsdesc = request.getParameter("goodsdesc");
            String goodsimgurl = request.getParameter("goodsimgurl");
        System.out.println(goodsname+goodsprice+goodsfakeprice+goodstype+goodsimgurl);
            Goods goods1 = new Goods();
            goods1 .setGoodsname(goodsname);
            goods1 .setGoodsprice(goodsprice);
            goods1 .setGoodsfakeprice(goodsfakeprice);
            goods1 .setGoodstype(goodstype );
            goods1 .setGoodsdesc (goodsdesc );
            goods1 .setGoodsimgurl(goodsimgurl );

            goodsService.save(goods1);

            return "redirect:/glist";
    }


    @GetMapping("/add/{goodsid}")
    public String toUptgoods(@PathVariable("goodsid") long goodsid,ModelMap modelMap) {
        System.out.println(goodsid);
        goods1 = goodsService.findById(goodsid);
        modelMap.addAttribute("uptgoods", goods1);

        return "addg";
    }
    @PostMapping ("/dl/{goodsid}")
    public String Dlgoods(@PathVariable Long goodsid) {
//        Goods gs=goodsService.findById( goodsid );
//        goodsService.deletegsById( goodsid  );
        goodsService.deletex(goodsid  );
        return "addgoos";
    }

}
