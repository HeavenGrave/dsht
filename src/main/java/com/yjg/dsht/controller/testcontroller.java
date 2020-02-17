package com.yjg.dsht.controller;


import com.yjg.dsht.dao.UserDao;
import com.yjg.dsht.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping
public class testcontroller {
    @Autowired

//    private UserService userService;

    private UserDao userDao;

    @RequestMapping("/id")
    public void id() {

//        List<Book> bs1 = bookDao.getBooksByAuthorStartingWith("卡");
//        List<Book> bs2 = bookDao.getBooksByPriceGreaterThan(60f);
//          User a = userDao.getMaxUseridUser();
//        List<Book> bs3 = bookDao.getBookByIdAndAuthor("冯唐", 2);
//        List<Book> bs4 = bookDao.getBookByIdAndName("人", 4);

//        System.out.println("作者名是'卡'开头的书籍：" + bs1);
//        System.out.println("价格超过60元的书籍：" + bs2);
//          System.out.println("id最大：" + a);
//          System.out.println("id最大：" + a.getUserid());
//        System.out.println("id大于1且作者为'冯唐'的书籍：" + bs3);
//        System.out.println("id小于4且书名包含'人'的书籍：" + bs4);
    }
}


