package io.ayers.spring.componentScan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
// Ensure each connection is a new instance, must use a proxy if the consuming class is a singleton
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentConnection {
    public ComponentConnection() {
        System.out.println("Components Connection Successful");
    }
}
