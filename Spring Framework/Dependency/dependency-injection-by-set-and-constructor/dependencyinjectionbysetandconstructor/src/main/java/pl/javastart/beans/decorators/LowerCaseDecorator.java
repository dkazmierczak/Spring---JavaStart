package pl.javastart.beans.decorators;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("lowwerCase")
public class LowerCaseDecorator implements MessageDecorator {

    @Override
    public String decorate(String msg) {
        return msg.toLowerCase();
    }
}
