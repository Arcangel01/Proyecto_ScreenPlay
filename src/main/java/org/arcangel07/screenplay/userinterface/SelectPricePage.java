package org.arcangel07.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectPricePage {
    public static final Target PRICES = Target.the("price list")
            .located(By.xpath("//div[@class=\"fare-detail-items\"]/item-fare/p/span"));
    public static final Target SELECT_PRICE = Target.the("select price")
            .located(By.xpath("//div[@class=\"mobile-container\"]/buy-button"));
}
