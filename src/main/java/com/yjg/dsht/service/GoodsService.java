package com.yjg.dsht.service;

import com.yjg.dsht.dao.GoodsDao;
import com.yjg.dsht.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {

    @Autowired
    private GoodsDao goodsDao;
    public List<Goods> findAll() {
        return goodsDao.findAll();
    }

    public void save(Goods goods) {
        goodsDao.save(goods);
    }
    public List<Goods> findByName(String goodsname) {

        return goodsDao.findByGoodsname(goodsname);
    }
}
