package org.arcangel07.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchFlightPage {

    public static final Target POP_UP = Target.the("popup")
            .located(By.className("incentive-close"));

    public static final Target ONLY_GO = Target.the("only go")
            .located(By.xpath("//input[@name=\"flight-type\" and @value=\"onlygo\"]"));

    public static final Target ORIGIN = Target.the("origin")
            .located(By.className("sbox-bind-reference-flight-roundtrip-origin-input"));

    public static final Target DESTINATION = Target.the("destination")
            .located(By.className("sbox-bind-reference-flight-roundtrip-destination-input"));

    public static final Target INPUT_DATE = Target.the("input date")
            .located(By.className("sbox-bind-reference-flight-start-date-input"));

    public static final Target DATE = Target.the("date")
            .located(By.xpath("//div[@data-month=\"2021-03\"]/div[4]/span[30]/span"));

    public static final Target SEARCH = Target.the("search")
            .located(By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[4]/div/a"));

    public static final Target CITY_ORIGIN = Target.the("city origin")
            .located(By.xpath("//li[@class=\"item\"]/span[@class=\"item-text\"]"));

    public static final Target CITY_DESTINATION = Target.the("city destination")
            .located(By.xpath("//li[@class=\"item -active\"]/span[@class=\"item-text\"]"));
}
