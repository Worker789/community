package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
public class AlphaConfig {

    @Bean
    public SimpleDateFormat simpleDateFormat() {
        //这段代码的含义是，返回的第三方对象将会被装配到容器里，bean的名字是simpleDateFormat
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
