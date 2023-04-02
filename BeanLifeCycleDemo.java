package BeanScopeAnnotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("b1")
public class BeanLifeCycleDemo {

    @PostConstruct
    void startUp(){
        System.out.println("Initialize Resources");
    }

    void display(){
        System.out.println("Display Method");
    }

    @PreDestroy//Custom Destroy Method
    void shutDown(){
        System.out.println("Clean Up code");
    }
}
