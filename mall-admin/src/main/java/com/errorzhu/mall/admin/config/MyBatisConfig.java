package com.errorzhu.mall.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 *
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.errorzhu.mall.mapper","com.macro.mall.dao"})
public class MyBatisConfig {
}
