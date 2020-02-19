package com.yjg.dsht.dao;

import com.yjg.dsht.entity.Goods;

import org.apache.ibatis.annotations.Delete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsDao extends JpaRepository<Goods, Long> {



    public List<Goods> findByGoodsname(String goodsname);

    public List<Goods> findByGoodsid(Integer goodsid);



//    public void deleteByGoodsid(Long goodsid);

//    @Query(value = "delete from goods where  goodsid =#{goodsid} ",nativeQuery = true)
//      public void deleteById(Long goodsid);
//    @Delete(value = "delete from goods where  goodsid =#{goodsid} ")
//    void deletdgsById(Long goodsid);

}
