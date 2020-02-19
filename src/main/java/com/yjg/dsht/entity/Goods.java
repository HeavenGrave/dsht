package com.yjg.dsht.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity(name="goods")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long goodsid;
    private  String goodsname;
    private  String goodsprice;
    private  String goodsfakeprice;
    private  String goodstype;
    private  String goodsdesc;
    private  String goodsimgurl;

    public Long getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Long goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(String goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getGoodsfakeprice() {
        return goodsfakeprice;
    }

    public void setGoodsfakeprice(String goodsfakeprice) {
        this.goodsfakeprice = goodsfakeprice;
    }

    public String getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(String goodstype) {
        this.goodstype = goodstype;
    }

    public String getGoodsdesc() {
        return goodsdesc;
    }

    public void setGoodsdesc(String goodsdesc) {
        this.goodsdesc = goodsdesc;
    }

    public String getGoodsimgurl() {
        return goodsimgurl;
    }

    public void setGoodsimgurl(String goodsimgurl) {
        this.goodsimgurl = goodsimgurl;
    }
}
