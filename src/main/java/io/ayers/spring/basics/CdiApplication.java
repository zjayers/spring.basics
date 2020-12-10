package io.ayers.spring.basics;

import io.ayers.spring.basics.cdi.CDIDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CdiApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(CdiApplication.class);

    public static void main(String[] args) {
        // Get Application Context
        CDIDao cdiDao;

        try (ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(CdiApplication.class)) {

            cdiDao = applicationContext.getBean(CDIDao.class);
        }

        LOGGER.info("{}", cdiDao);
        LOGGER.info("{}", cdiDao.getCdiConnection());

    }

}
