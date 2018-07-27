package com.dufe.servicefeign;

import com.dufe.servicefeign.rest.App;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableEurekaClient
public class ServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean jersetServlet(){
        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/v1/*");
        // our rest resources will be available in the path /jersey/*
        registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, App.class.getName());
        return registration;
    }
}
