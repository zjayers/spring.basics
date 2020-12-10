package io.ayers.spring.componentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ComponentDAO {

    @Autowired
    ComponentConnection componentConnection;

    public ComponentConnection getComponentConnection() {
        return componentConnection;
    }
}
