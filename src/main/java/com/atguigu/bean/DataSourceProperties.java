package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
@Component
public class DataSourceProperties {
    //@Value()注解 可以将属性配置文件中的属性配置获取注入
    @Value("${spring.jdbc.datasource.driverClassName}")
    private String driverClassName;
    @Value("${spring.jdbc.datasource.url}")
    private String url;
    @Value("${spring.jdbc.datasource.username}")
    private String username;
    @Value("${spring.jdbc.datasource.password}")
    private String password;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DataSourceProperties{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
