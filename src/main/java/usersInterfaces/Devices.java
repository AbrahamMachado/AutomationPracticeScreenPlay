package usersInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Devices {
    public static final Target SISTEAMA = Target.the("sistema").
            locatedBy("(//span[@class='btn btn-default form-control ui-select-toggle'])[1]");
    public static final Target WINDOWS = Target.the("windows").
            locatedBy("(//span[@class='ui-select-choices-row-inner'])[2]");

    public static final Target VERSIONS = Target.the("version").
            locatedBy("(//span[@class='btn btn-default form-control ui-select-toggle'])[2]");
    public static final Target XP = Target.the("xp").
            locatedBy("(//span[@class='ui-select-choices-row-inner'])[2]");

    public static final Target LANGUAJE = Target.the("languaje").
            locatedBy("(//span[@class='btn btn-default form-control ui-select-toggle'])[3]");
    public static final Target ENGLISH = Target.the("english").
            locatedBy("(//span[@class='ui-select-choices-row-inner'])[11]");

    public static final Target BUTTON_LAST_FINAL = Target.the("button last final").
            locatedBy("//a[@aria-label='Next - final step']");
}
