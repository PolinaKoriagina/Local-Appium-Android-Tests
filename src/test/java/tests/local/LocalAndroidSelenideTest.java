package tests.local;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


@Tag("selenide_android")
public class LocalAndroidSelenideTest extends LocalTestBase {

    @Test
    @DisplayName("Verify getting started")
    void verifyText() {
        step("Verify text The free Encyclopedia", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"))
                        .shouldHave(Condition.text("The free Encyclopedia")));
        step("Tap Continue", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Verify text New ways to explore", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"))
                        .shouldHave(Condition.text("New ways to explore")));
        step("Tap Continue", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Verify text Reading lists with sync", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"))
                        .shouldHave(Condition.text("Reading lists with sync")));
        step("Tap Continue", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Verify clickable element", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/switchView"))
                        .shouldHave(Condition.attribute("clickable")));


    }
}


//    @Test
//    @DisplayName("Successful search in wikipedia android app")
//    void searchTest() {
//        back();
//
//        step("Type search", () -> {
//            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
//            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).val("BrowserStack");
//        });
//        step("Verify content found", () ->
//                $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_title"))
//                        .shouldHave(sizeGreaterThan(0)));
//    }