package io.ayers.spring.basics.fundamentals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("quick")
    private SortAlgo algo;

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        System.out.println(algo.getClass().getSimpleName());
        int[] sortedNums = algo.sort(numbers);
        System.out.println(Arrays.toString(sortedNums));
        // Sorting an array
        // Search the array
        // Return the result
        return 3;
    }

//    @PostConstruct
//    public void postConstruct() {
//        // Fire once the bean is created and initialized with dependencies
//        logger.info("Post Construct");
//    }
//
//    @PreDestroy
//    public void preDestroy() {
//        // Fire before the bean is removed
//        logger.info("Pre Destroy");
//    }
}
