package com.yjg.dsht.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="user")
public class User {

       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private  Integer userid;
       private  String phonenumber;
       private  String password;
       private  String username;
       private  String birthday;
       private  String email;
       private  String spare_phonenumber;
       //礼物卡积分
       private  String giftcardnumber;
       //课时
       private  String classhour;

       public Integer getUserid() {
              return userid;
       }

       public void setUserid(Integer userid) {
              this.userid = userid;
       }

       public String getPhonenumber() {
              return phonenumber;
       }

       public void setPhonenumber(String phonenumber) {
              this.phonenumber = phonenumber;
       }

       public String getPassword() {
              return password;
       }

       public void setPassword(String password) {
              this.password = password;
       }

       public String getUsername() {
              return username;
       }

       public void setUsername(String username) {
              this.username = username;
       }

       public String getBirthday() {
              return birthday;
       }

       public void setBirthday(String birthday) {
              this.birthday = birthday;
       }

       public String getEmail() {
              return email;
       }

       public void setEmail(String email) {
              this.email = email;
       }

       public String getSpare_phonenumber() {
              return spare_phonenumber;
       }

       public void setSpare_phonenumber(String spare_phonenumber) {
              this.spare_phonenumber = spare_phonenumber;
       }

       public String getGiftcardnumber() {
              return giftcardnumber;
       }

       public void setGiftcardnumber(String giftcardnumber) {
              this.giftcardnumber = giftcardnumber;
       }

       public String getClasshour() {
              return classhour;
       }

       public void setClasshour(String classhour) {
              this.classhour = classhour;
       }
}
