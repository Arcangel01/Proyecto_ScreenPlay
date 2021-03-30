package org.arcangel07.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.arcangel07.screenplay.userinterface.SelectAccommodationPage.SEE_DETAIL;


public class AccommodationPage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return SEE_DETAIL.resolveFor(actor).isVisible();
    }

    @Override
    public String getSubject() {
        return "The page is visible";
    }

    public static Question<Boolean> isVisible() {
        return new AccommodationPage();
    }
}
