package pl.javastart.beans;

import org.springframework.stereotype.Component;

@Component
public class SimpleMessageProducer implements MessageProducer {

    @Override
    public String getMessage() {
        return "Example message " + System.currentTimeMillis();
    }
}