package usersInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Complete {
    public static final Target PASSWORD = Target.the("password").
            locatedBy("//input[@id='password']");

    public static final Target CONFIRM_PASSWORD = Target.the("confirm password").
            locatedBy("//input[@id='confirmPassword']");

    public static final Target CHECK_ONE = Target.the("check one").
            locatedBy("(//span[@class='checkmark signup-consent__checkbox error'])[1]");

    public static final Target CHECK_TWO = Target.the("check two").
            locatedBy("//span[@ng-class='{error: userForm.privacySetting.$error.required}']");

    public static final Target BUTTON_COMPLETE = Target.the("button complete").
            locatedBy("//a[@id='laddaBtn']");

}
