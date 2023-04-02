package sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("laptop1")
public class GamingLaptop implements Laptop{

    //Constructor injection
    Processor pro = null;
    public GamingLaptop(@Qualifier("processor1") Processor pro) {
        this.pro = pro;
    }

    @Override
    public void getType() {
        System.out.println("Laptop type is a Gaming");
    }

    @Override
    public void getProcessorInfo() {
        pro.getName();
    }
}
