package com.finearter.dbs.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lwx
 */
@Configuration
@MapperScan("com.finearter.dbs.mapper")
public class MybatisConfig {
}
