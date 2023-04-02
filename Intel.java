package sample;

import org.springframework.stereotype.Component;

@Component("processor1")
public class Intel implements Processor{
    @Override
    public void getName() {
        System.out.println("Processor name is a Intel");
    }
}
