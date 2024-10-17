package com.fmw.community.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
@MapperScan("com.fmw.community.dao")  // 请根据实际包名修改
public class AlphaConfig {

    @Bean
    public SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
