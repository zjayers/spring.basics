package io.ayers.spring.basics.cdi;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public class CDIConnection {

    public int[] getData() {
        return new int[] {5, 89, 100};
    }

}
