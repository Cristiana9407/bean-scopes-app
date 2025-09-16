package pixel.academy.setter_injection_app.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FrenchShef implements Chef{


    public FrenchShef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Preparez un Boeuf Bourguignon avec vin rouge et herbes";
    }
}
