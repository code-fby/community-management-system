package com.fby.dbs.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lwx
 */
@Configuration
@MapperScan("com.fby.dbs.mapper")
public class MybatisConfig {
}
