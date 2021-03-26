package com.dinl.spring.config;

import com.dinl.spring.pojo.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : dingliang
 * @since : 2021/3/25
 **/
@Configuration
public class MyConfig {
    @Bean
    public User user(){
        return new User();
    }

}
