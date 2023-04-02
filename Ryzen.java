package sample;

import org.springframework.stereotype.Component;

@Component("processor2")
public class Ryzen implements Processor{
    @Override
    public void getName() {
        System.out.println("Processor type is a Ryzen");
    }
}
