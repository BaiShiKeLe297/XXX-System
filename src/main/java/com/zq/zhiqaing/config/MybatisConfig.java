package com.zq.zhiqaing.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@MapperScan("com/zq/zhiqaing/dao")
@MapperScan("com.zq.zhiqaing.dao")
public class MybatisConfig {

    /**
     * mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDbType(DbType.MYSQL);
        return page;

        //这两个都好像能起作用 但是不知道区别是什么。TODO
        //        PaginationInterceptor page = new PaginationInterceptor();
        //        page.setCountSqlParser(new JsqlParserCountOptimize(true));
        //        return page;
    }

}