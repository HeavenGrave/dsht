package com.yjg.dsht.dao;

import com.yjg.dsht.entity.Goods;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsDao extends JpaRepository<Goods, Long> {


//    public Goods findByUsernameAndPassword(String username, String password);
    public List<Goods> findByGoodsname(String goodsname);


}
