package usersInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Adress {
    public static final Target BUTTON_LOCATION = Target.the("button location").
            locatedBy("//a[@aria-label='Next step - select your devices']");
}
