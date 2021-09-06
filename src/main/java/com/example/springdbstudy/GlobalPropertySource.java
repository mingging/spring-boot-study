//package com.example.springdbstudy;
//
//import lombok.Data;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.annotation.PropertySources;
//
//@Configuration
//@PropertySources({
//        @PropertySource( value = "file:c:/dev/config.properties", ignoreResourceNotFound = true ),
//        @PropertySource( value = "file:${user.home}/env/config.properties", ignoreResourceNotFound = true)
//})
//@Data
//public class GlobalPropertySource {
//
//    @Value("${spring.datasource.driverClassName}")
//    private String diverClassName;
//
//    @Value("${spring.datasource.url}")
//    private String url;
//
//    @Value("${spring.datasource.username}")
//    private String username;
//
//    @Value("${spring.datasource.password}")
//    private String password;
//
//}
