package io.ayers.spring.basics;

import io.ayers.spring.basics.xml.XmlDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Before Spring 2.5 - Injections had to be wired in manually through XML
// See "spring<2.5_xmlApplicationContext.xml" for configuration
public class XmlApplication {


    private static final Logger LOGGER = LoggerFactory.getLogger(XmlApplication.class);

    public static void main(String[] args) {
        // Get Application Context
        XmlDao xmlDao;

        try (ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring<2.5_xmlApplicationContext.xml")) {

            LOGGER.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());

            xmlDao = applicationContext.getBean(XmlDao.class);
        }

        LOGGER.info("{}", xmlDao);
        LOGGER.info("{}", xmlDao.getXmlConnection());
    }

}
