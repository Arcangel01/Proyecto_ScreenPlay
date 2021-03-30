package org.arcangel07.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.arcangel07.screenplay.userinterface.ReservationPage.RESERVATION;

public class ReservationPage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return RESERVATION.resolveFor(actor).isVisible();
    }

    @Override
    public String getSubject() {
        return "The reservation page is visible";
    }

    public static Question<Boolean> isVisible() {
        return new ReservationPage();
    }
}
