package io.ayers.spring.basics;

import io.ayers.spring.basics.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ScopeApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScopeApplication.class);

    public static void main(String[] args) {
        // Get Application Context
        PersonDAO personDAO;
        PersonDAO personDAO2;
        try (ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeApplication.class)) {

            personDAO = applicationContext.getBean(PersonDAO.class);
            personDAO2 = applicationContext.getBean(PersonDAO.class);
        }

        LOGGER.info("{}", personDAO);
        LOGGER.info("{}", personDAO.getJdbcConnection());

        LOGGER.info("{}", personDAO2);
        LOGGER.info("{}", personDAO2.getJdbcConnection());
        LOGGER.info("Complete");

    }

}
