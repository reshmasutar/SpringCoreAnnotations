package BeanScopeAnnotation;

import org.springframework.stereotype.Component;

@Component("m1")
public class Master {
    void test(){
        System.out.println("From Master");
    }
}
