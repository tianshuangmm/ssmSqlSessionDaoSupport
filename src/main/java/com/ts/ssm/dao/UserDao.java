package com.ts.ssm.dao;

import com.ts.ssm.bean.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao   extends   BaseDao {

    public User getUser(Integer id){
        User user = getSqlSession().selectOne("user.select",id);
        return user;
    }
}
