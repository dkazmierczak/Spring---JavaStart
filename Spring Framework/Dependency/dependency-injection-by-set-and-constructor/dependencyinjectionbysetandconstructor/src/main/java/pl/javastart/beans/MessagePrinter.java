package pl.javastart.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    private MessageProducer producer;
    private MessageDecorator decorator;

    MessagePrinter() {}

    @Autowired
    public MessagePrinter(MessageProducer producer) {
        this.producer = producer;
    }

    public MessagePrinter(MessageDecorator decorator) {
        this.decorator = decorator;
    }

    @Autowired(required = false)
    public void setDecorator(MessageDecorator decorator) {
        this.decorator = decorator;
    }

    public MessageProducer getProducer() {
        return producer;
    }

    // @Autwired można też w tym miejscu zamiast nad konstruktorem
    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    public void print() {
        String message = producer.getMessage();
        message = decorator != null?decorator.decorate(message):message;
        System.out.println(message);
    }
}