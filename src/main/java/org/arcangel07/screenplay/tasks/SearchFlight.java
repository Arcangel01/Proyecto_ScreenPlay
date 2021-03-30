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
import static org.arcangel07.screenplay.userinterface.SearchFlightPage.*;

public class SearchFlight implements Task {

    private Search search;

    public SearchFlight(Search search) {
        this.search = search;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(POP_UP, isClickable()),
                Click.on(POP_UP),
                JavaScriptClick.on(ONLY_GO),
                Enter.theValue(search.getOrigin()).into(ORIGIN),
                Click.on(CITY_ORIGIN),
                Enter.theValue(search.getDestination()).into(DESTINATION),
                Click.on(CITY_DESTINATION),
                Click.on(INPUT_DATE),
                Click.on(DATE),
                Click.on(SEARCH)
        );
    }

    public static SearchFlight with(Search search) {
        return instrumented(SearchFlight.class, search);
    }

}
