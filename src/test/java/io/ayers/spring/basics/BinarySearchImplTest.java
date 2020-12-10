package io.ayers.spring.basics;

import io.ayers.spring.basics.fundamentals.BinarySearchImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


@ContextConfiguration(classes = FundamentalsApplication.class)
@RunWith(SpringRunner.class)
public class BinarySearchImplTest {

    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBinarySearch() {
        int result = binarySearch.binarySearch(new int[]{}, 5);
        assertEquals(3, result);
    }

    @Test
    public void testBinarySearchFailure() {
        int result = binarySearch.binarySearch(new int[]{}, 5);
        assertNotEquals(4, result);
    }

} 
