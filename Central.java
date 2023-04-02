package BeanScopeAnnotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("c1")
@Scope("prototype")
public class Central {
    void test(){
        System.out.println("From Central");
    }
}
