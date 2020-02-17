package com.yjg.dsht.controller;

import com.yjg.dsht.dao.GoodsDao;
import com.yjg.dsht.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping
public class GoodsController {

    @Autowired
    private GoodsService goodsService;
    Object goods;

    @RequestMapping("/list")
    public String List() {
        return "list";
    }

    @RequestMapping("/gadd")
    public String Gadd() {
        return "goodsadd";
    }

    @RequestMapping("/glist")
    public String Glist(ModelMap modelMap) {
        goods = goodsService.findAll();
        modelMap.addAttribute("glist", goods);

        return "addgoos";
    }

}
