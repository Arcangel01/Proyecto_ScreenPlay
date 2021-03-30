package org.arcangel07.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectAccommodationPage {
    public static final Target SEE_DETAIL = Target.the("see detail")
            .located(By.xpath("//div[@class=\"pricebox-action\"]/aloha-button/button"));
}
