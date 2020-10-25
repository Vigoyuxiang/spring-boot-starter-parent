package com.atguigu.controller;

import com.atguigu.bean.DataSourceProperties;
import com.atguigu.bean.DataSourceProperties2;
import com.atguigu.bean.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController//组合注解  ，组合  @Controller + @ResponseBody
public class HelloController {
    //@Resource  //JDK提供的， 比较通用，先byname,在bytype
    //@Autowired  //Spring 框架提供的。先bytype,再byname
   // DataSourceProperties dataSourceProperties;\
    //@Autowired
    //DataSourceProperties2 dataSourceProperties2;
   /* @Autowired
    JdbcProperties jdbcProperties;*/
   @Autowired
   DataSource dataSource;
    @RequestMapping("/hello")
    public String Hello(){
       // System.out.println("dataSourceProperties2="+dataSourceProperties2);
        System.out.println("jdbcProperties="+dataSource);
        return "hello spring boot!!";
    }
}
