package BeanScopeAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("appilicationContext.xml");
        BeanLifeCycleDemo d1 = c1.getBean("b1", BeanLifeCycleDemo.class);
        d1.display();
        c1.close();
    }
}
