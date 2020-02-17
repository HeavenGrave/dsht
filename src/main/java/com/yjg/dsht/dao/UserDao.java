package com.yjg.dsht.dao;


import com.yjg.dsht.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDao extends JpaRepository<User, Long> {

    public User findByUsernameAndPassword(String username, String password);
    public List<User> findByUsername(String username);

    // 查询id最大的id（使用原生的SQL进行查询）
    @Query(value = "select * from db_dianshang.user where userid=(select max(userid) from db_dianshang.user)",nativeQuery =true)
//    @Query(value = "select * from db_dianshang.user where userid='1'",nativeQuery =true)
    User getMaxUseridUser();
}
