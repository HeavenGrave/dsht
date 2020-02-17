package com.yjg.dsht.entity;

public class Address {

    private  Integer addressid;
    private  String  userid;
    private  String  useraddress;
    private  String  phonenumber;
    private  String  areaidpath;

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAreaidpath() {
        return areaidpath;
    }

    public void setAreaidpath(String areaidpath) {
        this.areaidpath = areaidpath;
    }
}
