package io.ayers.spring.basics;

import io.ayers.spring.basics.fundamentals.BinarySearchImpl;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class FundamentalsApplication {

    public static void main(String[] args) {

        // Get Application Context

        BinarySearchImpl binarySearch;
        try (ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(FundamentalsApplication.class)) {

            // Get Beans
            binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        }

        // Use Beans
        int result = binarySearch.binarySearch(new int[]{12, 3}, 3);
        System.out.println(result);

    }

}
