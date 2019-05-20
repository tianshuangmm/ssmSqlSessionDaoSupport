package com.ts.ssm.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.security.PrivateKey;

public class BaseDao extends SqlSessionDaoSupport{
    @Autowired
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate)
    {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

}
