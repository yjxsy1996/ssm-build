package com.yuanfeng.test;/**
 * Created by yuanfeng on 2019/7/9 16:26
 */

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 *@ClassName Test1
 *@Description T0D0
 *@Author yuanfeng
 *@Date 2019/7/9 16:26
 *@Version 1.0
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test1 {


    @Autowired
    private DataSource dataSource;

    public void test1(){


    }

}
