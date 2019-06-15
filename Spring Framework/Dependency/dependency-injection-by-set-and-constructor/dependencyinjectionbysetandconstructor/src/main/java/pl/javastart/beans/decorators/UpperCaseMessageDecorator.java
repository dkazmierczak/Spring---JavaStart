package pl.javastart.beans.decorators;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.javastart.beans.decorators.MessageDecorator;

@Component
@Primary //jeśli chcemy żeby był głównym komponentem
//@Qualifier("upperCase")
public class UpperCaseMessageDecorator implements MessageDecorator {

    @Override
    public String decorate(String msg) {
        return msg.toUpperCase();
    }
}
