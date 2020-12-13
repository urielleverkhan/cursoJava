package com.digitalinnovationone.springboot.config;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {
    private String driverCLassName;
    private String url;
    private String userName;
    private String password;

    @Profile("dev")
    @Bean
    public String testDataBaseConnection(){
        System.out.println("DB connection for Dev - h2");
        System.out.println(driverCLassName);
        System.out.println(url);
        return "DB Connection to H2_TEST - Test instance";
    }

    @Profile("prod")
    @Bean
    public String productionDataBaseConnection(){
        System.out.println("DB connection for Production - MSQL");
        System.out.println(driverCLassName);
        System.out.println(url);
        return "DB Connection to MYSQL_PROD - Production instance";
    }


}
