package pl.javastart.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.javastart.beans.printers.MessagePrinter;

@Configuration
@ComponentScan
//or @ComponentScan(basePackageClasses = MessagePrinter.class)
//or @ComponentScan(basePackages = "pl.javastart.beans")
//or @ComponentScan(basePackages = "pl.javastart")
public class SpringDiApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringDiApplication.class);
        MessagePrinter printer = ctx.getBean(MessagePrinter.class);
        printer.print();
        ctx.close();
    }
}