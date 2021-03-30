package org.arcangel07.screenplay.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.arcangel07.screenplay.model.Search;
import org.arcangel07.screenplay.questions.ReservationPage;
import org.arcangel07.screenplay.tasks.SearchFlight;
import org.arcangel07.screenplay.tasks.SelectPrice;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReservationStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) wants to select a flight")
    public void goFindFlight(String actorName) {
        theActorCalled(actorName).wasAbleTo(Open.url("https://www.despegar.com.co/"));
    }

    @When("Arcangel wants to make the reservation")
    public void selectFlight() {
        theActorInTheSpotlight().attemptsTo(SearchFlight.with(new Search("Medellin", "Santa Marta, Magdalena")));
        theActorInTheSpotlight().attemptsTo(new SelectPrice());
    }

    @Then("Arcangel makes the reservation")
    public void takeReservation() {
        theActorInTheSpotlight().should(seeThat(ReservationPage.isVisible()));
    }
}
