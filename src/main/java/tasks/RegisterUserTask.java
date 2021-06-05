package  tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import usersInterfaces.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.REGISTER),
                SendKeys.of("abraham").into(Personal.FIRST_NAME),
                SendKeys.of("machado").into(Personal.LAST_NAME),
                SendKeys.of("abraham@yopmail.com").into(Personal.EMAIL),
                SendKeys.of("July").into(Personal.MONTH),
                SendKeys.of("5").into(Personal.DAY),
                SendKeys.of("1998").into(Personal.YEAR),
                Click.on(Personal.NEXT_LOCATION),
                Click.on(Adress.BUTTON_LOCATION),
                Click.on(Devices.SISTEAMA),
                Click.on(Devices.WINDOWS),
                Click.on(Devices.VERSIONS),
                Click.on(Devices.XP),
                Click.on(Devices.LANGUAJE),
                Click.on(Devices.ENGLISH),
                Click.on(Devices.BUTTON_LAST_FINAL),
                SendKeys.of("AbrahamMachado1998*").into(Complete.PASSWORD),
                SendKeys.of("AbrahamMachado1998*").into(Complete.CONFIRM_PASSWORD),
                Click.on(Complete.CHECK_ONE),
                Click.on(Complete.CHECK_TWO),
                Click.on(Complete.BUTTON_COMPLETE)
        );
    }

    public static RegisterUserTask makeInformation(){
        return instrumented(RegisterUserTask.class);
    }
}
