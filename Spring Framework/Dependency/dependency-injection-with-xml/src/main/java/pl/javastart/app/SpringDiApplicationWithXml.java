package pl.javastart.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.javastart.beans.MessagePrinter;

public class SpringDiApplicationWithXml {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
        MessagePrinter printer = ctx.getBean(MessagePrinter.class);
        printer.print();
        ctx.close();
    }
}
