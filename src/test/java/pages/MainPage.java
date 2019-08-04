package pages;

import helpers.Settings;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

//    public void clickDigit(Integer digit) {
//        $(MobileBy.id(String.format("com.android.calculator2:id/digit_%s", digit))).click();
//    }
//
//    public void clickEqual() {
//        $(MobileBy.id("com.android.calculator2:id/eq")).click();
//    }
//
//    public void clickPlus() {
//        $(MobileBy.id("com.android.calculator2:id/op_add")).click();
//    }
//
//    public String getResult() {
//        return $(MobileBy.id("com.android.calculator2:id/formula")).getText();
//    }

    public void goToContacts() {
        $(MobileBy.xpath("//android.view.View[@content-desc=\"Контакты\"]")).click();
    }

    public void getContactInfo(String contact) {

    }
}
