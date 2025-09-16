package pixel.academy.setter_injection_app.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TurkishChef implements Chef {

    public TurkishChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyRecipe() {
        return "Prepara un kebab cu carne de miel,servit cu pilaf de orez si iaurt!";
    }

}
