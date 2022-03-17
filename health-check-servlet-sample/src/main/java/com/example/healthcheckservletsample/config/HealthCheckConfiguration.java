package com.example.healthcheckservletsample.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HealthCheckConfiguration {

    @Bean
    public ServletRegistrationBean<HealthCheckServlet> getServletRegistrationBean() {

        ServletRegistrationBean<HealthCheckServlet> registrationBean =
                new ServletRegistrationBean<>(new HealthCheckServlet());

        registrationBean.addUrlMappings("/api/test");

        return registrationBean;
    }
}
