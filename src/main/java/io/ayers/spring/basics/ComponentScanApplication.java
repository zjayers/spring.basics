package io.ayers.spring.basics;

import io.ayers.spring.componentScan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("io.ayers.spring.basics")
@ComponentScan("io.ayers.spring.componentScan")
public class ComponentScanApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class);

    public static void main(String[] args) {
        // Get Application Context
        ComponentDAO componentDAO;
        ComponentDAO componentDAO2;
        try (ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentScanApplication.class)) {

            componentDAO = applicationContext.getBean(ComponentDAO.class);
            componentDAO2 = applicationContext.getBean(ComponentDAO.class);
        }

        LOGGER.info("{}", componentDAO);
        LOGGER.info("{}", componentDAO.getComponentConnection());

        LOGGER.info("{}", componentDAO2);
        LOGGER.info("{}", componentDAO2.getComponentConnection());
        LOGGER.info("Complete");

    }

}
