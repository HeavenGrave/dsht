package com.yjg.dsht.service;

import com.yjg.dsht.dao.UserDao;
import com.yjg.dsht.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;


    public List<User> findAll() {
        return userDao.findAll();
    }
    public User FindNameAndPsw(String username, String password) {
        return userDao.findByUsernameAndPassword(username, password);
    }
    public void save(User user1) {
        userDao.save(user1);
    }
    public List<User> findByName(String username) {

        return userDao.findByUsername(username);
    }

    public User findmaxid(){
        return  userDao.getMaxUseridUser();
    }
}





