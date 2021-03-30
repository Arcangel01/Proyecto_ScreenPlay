package org.arcangel07.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.arcangel07.screenplay.userinterface.SelectPricePage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectPrice implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SelectPricePage.SELECT_PRICE, isVisible()),
                Scroll.to(SelectPricePage.SELECT_PRICE),
                Click.on(SelectPricePage.SELECT_PRICE)
        );
    }
}
