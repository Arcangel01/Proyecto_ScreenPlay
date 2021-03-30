package org.arcangel07.screenplay.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservationPage {
    public static final Target RESERVATION = Target.the("reservation")
            .located(By.className("chk-pricebox-title-text"));
}
