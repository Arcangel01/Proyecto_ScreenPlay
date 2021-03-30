package org.arcangel07.screenplay.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.arcangel07.screenplay.model.Search;
import org.arcangel07.screenplay.questions.AccommodationPage;
import org.arcangel07.screenplay.tasks.SearchAccommodation;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AccommodationStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) wants to find an accommodation")
    public void findAccommodation(String actorName) {
        theActorCalled(actorName).wasAbleTo(Open.url("https://www.despegar.com.co/"));
    }

    @When("Arcangel selects the accommodation")
    public void selectsAccommodation() {
        theActorInTheSpotlight().attemptsTo(SearchAccommodation.with(new Search("Santa Marta, Magdalena")));
    }

    @Then("Arcangel reserves the accommodation")
    public void reservesAccommodation() {
        theActorInTheSpotlight().should(seeThat(AccommodationPage.isVisible()));
    }
}
