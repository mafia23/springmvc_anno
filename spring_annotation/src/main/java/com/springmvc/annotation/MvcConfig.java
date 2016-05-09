package com.springmvc.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by yzp on 2016/5/9.
 */
@Configuration// 类似于spring配置文件，负责注册bean，对应的提供了@Bean注解
@EnableWebMvc //用于在基于Java类定义Bean配置中开启MVC支持，和XML中的<mvc:annotation-driven>功能一样；
@ComponentScan({"com.springmvc.annotation"})
public class MvcConfig extends WebMvcConfigurationSupport {
    /**
     * 描述 : <注册试图处理器>. <br>
     *<p>
     <使用方法说明>
     </p>
     * @return
     */
    @Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/jsp/function/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;

    }
}
