package org.acme;

import javax.enterprise.context.ApplicationScoped;
import org.springframework.core.ParameterizedTypeReference;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        return "hello " + name;
    }
    
    public String greeting(ParameterizedTypeReference<String> name) {
        
        return "hello " + name.getType().getTypeName();
    }


}

