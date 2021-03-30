package org.arcangel07.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.arcangel07.screenplay.model.Search;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static org.arcangel07.screenplay.userinterface.SearchAccommodationPage.*;
import static org.arcangel07.screenplay.userinterface.SearchFlightPage.CITY_DESTINATION;
import static org.arcangel07.screenplay.userinterface.SearchFlightPage.POP_UP;

public class SearchAccommodation implements Task {

    private Search search;

    public SearchAccommodation(Search search) {
        this.search = search;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(POP_UP, isClickable()),
                Click.on(POP_UP),
                Click.on(PRODUCTS),
                JavaScriptClick.on(DESTINATION),
                Enter.theValue(search.getDestination()).into(DESTINATION),
                Click.on(CITY_DESTINATION),
                Click.on(FIELD_DATES),
                Click.on(DATE1),
                Click.on(DATE2),
                Click.on(SEARCH_BUTTON)
        );
    }

    public static SearchAccommodation with(Search search) {
        return instrumented(SearchAccommodation.class, search);
    }
}
