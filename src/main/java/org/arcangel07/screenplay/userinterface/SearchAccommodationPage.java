package org.arcangel07.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchAccommodationPage {

    public static final Target PRODUCTS = Target.the("products")
            .located(By.xpath("//li[@class=\"header-product-item \"]/a[@product=\"HOTELS\"]"));

    public static final Target DESTINATION = Target.the("destination")
            .located(By.xpath("//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div[3]/div[1]/div/div/div/input"));

    public static final Target FIELD_DATES =Target.the("check date")
            .located(By.className("sbox5-dates-input1-container"));

    public static final Target DATE1 = Target.the("date")
            .located(By.xpath("//div[@data-month=\"2021-03\" and @class=\"sbox5-monthgrid\"]/div[3]/div[30]"));

    public static final Target DATE2 = Target.the("date")
            .located(By.xpath("//div[@data-month=\"2021-04\" and @class=\"sbox5-monthgrid\"]/div[3]/div[3]"));

    public static final Target SEARCH_BUTTON = Target.the("search button")
            .located(By.xpath("//button[@type=\"button\"]"));
}
