package io.ayers.spring.basics;

import io.ayers.spring.basics.properties.ExternalService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:external.properties")
public class ExternalPropertiesApplication {

    public static void main(String[] args) {

        // Get Application Context
        ExternalService externalService;
        try (ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExternalPropertiesApplication.class)) {

            // Get Beans
            externalService = applicationContext.getBean(ExternalService.class);
        }

        System.out.println(externalService.getServiceUrl());

    }

}
