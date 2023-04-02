package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("laptop2")
public class BusinessLaptop implements Laptop{

    //Constructor Injection
   Processor pro;
    @Autowired
    public BusinessLaptop(@Qualifier("processor2") Processor pro) {
        this.pro = pro;
    }

    @Override
    public void getType() {
        System.out.println("Laptop type is a Business");

    }

    @Override
    public void getProcessorInfo() {
       pro.getName();
    }
}
