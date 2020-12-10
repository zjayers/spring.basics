package io.ayers.spring.basics.cdi;

import io.ayers.spring.basics.CdiApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@ContextConfiguration(classes = CdiApplication.class)
@RunWith(SpringRunner.class)
public class CdiDaoTest {

    @Mock
    CDIConnection cdiConnection;

    @InjectMocks
    CDIDao cdiDao;

    @Before
    public void initMocks(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetFirst() {
        when(cdiConnection.getData()).thenReturn(new int[] {5, 4, 3});
        int result = cdiDao.getFirst();
        assertEquals(5, result);
    }
} 
