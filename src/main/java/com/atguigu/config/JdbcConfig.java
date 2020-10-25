package com.atguigu.config;

import com.atguigu.bean.DataSourceProperties;
import com.atguigu.bean.DataSourceProperties3;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
@SpringBootConfiguration
public class JdbcConfig {
    @Bean//声名一个Bean对象
    @ConfigurationProperties(prefix = "spring.jdbc.datasource")
    @ConditionalOnMissingBean
    public DataSourceProperties3 dataSourceProperties3(){
        return new DataSourceProperties3();
    }
}
