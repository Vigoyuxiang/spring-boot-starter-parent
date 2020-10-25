package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//扫描包，默认扫描主程序所在的包以及子包
//@ComponentScan("com.atguigu.controller")
@SpringBootApplication
/*
* •	@SpringBootConfiguration :（SpringBoot提供的） 代表这个类就是一个配置类 , 本质上就是一个
* @Configuration注解(spring 提供的)
* @ComponentScan : 组件扫描, 默认扫描启动类所在包及子包下的类身上的注解
* @EnableAutoConfiguration : 启用自动配置注解 ,
 *      会自动加载配置类（这些配置类都是第三方框架与第三方继承的配置，框架都提供好了）
 *      从哪加载配置类:META-INF/spring.factories  在jar包里搜索
 *      找key=org.springframework.boot.outoconfigure.EnableAutoConfiguration名称的值
 *      Spring 2.2.2  框架提供了124个自动配置类
 *      例如: XxxConfiguration  配置类，相当于XML配置文件的作用
 *      HttpEncodingAutoConfiguration
 *      每一个配置类，往往都对应一个xxxproperties属性类】
 *      HttpProperties  用来封装框架默认配置，如果希望修改框架默认配置，就通过特定属性名称进行配置即可
 *      124配置类会都生效吗
 *           根据条件注解进行判断：
 *                 框架提供了很多以@ConditionalOnXxx注解
 *
 *
* */
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
