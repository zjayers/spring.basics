package io.ayers.spring.basics.cdi;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public class CDIDao {

    @Inject
    CDIConnection cdiConnection;

    public CDIConnection getCdiConnection() {
        return cdiConnection;
    }

}
