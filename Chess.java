package demo;

import org.springframework.stereotype.Component;

@Component("sport2")
public class Chess implements Sport{
    @Override
    public void getName() {
        System.out.println("It is a Chess");
    }

    @Override
    public void getType() {
        System.out.println("It is a Inddor Sport");
    }
}
