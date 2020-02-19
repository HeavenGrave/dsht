package com.yjg.dsht.service;

import com.yjg.dsht.dao.GoodsDao;
import com.yjg.dsht.entity.Goods;
import com.yjg.dsht.entity.User;
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

    public void save(Goods goods1) {
        goodsDao.save( goods1 );
    }



    public Goods findById(long goodsid) {

        return goodsDao.getOne( goodsid  ) ;

    }


    public void deletex(Long goodsid) {
        goodsDao.deleteById(goodsid);
    }

}
