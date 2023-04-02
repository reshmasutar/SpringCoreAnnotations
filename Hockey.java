package demo;

import org.springframework.stereotype.Component;

@Component("sport1")
public class Hockey implements Sport{
    @Override
    public void getName() {
        System.out.println("It is a Hockey");
    }

    @Override
    public void getType() {
        System.out.println("It is a Outdoor sport");
    }
}
