package pl.javastart.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    @Autowired
    private MessageProducer producer;
    /*
    * Alternatywnie po dodaniu:
    *
    * <dependency>
	*    <groupId>javax.enterprise</groupId>
	*    <artifactId>cdi-api</artifactId>
	*    <version>1.2</version>
    * </dependency>
    *
    * w pliku pom.xml
    *
    * możemy zamiast @Autowired użyć @Inject
    *
    * @Inject
	* private MessageProducer producer;
    * */

    MessagePrinter() {}

    public MessagePrinter(MessageProducer producer) {
        this.producer = producer;
    }

    public MessageProducer getProducer() {
        return producer;
    }
    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    public void print() {
        System.out.println(producer.getMessage());
    }
}