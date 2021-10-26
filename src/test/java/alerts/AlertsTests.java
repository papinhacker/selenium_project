package alerts;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlertsTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertPage = homePage.clickAlertsPage();
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();
        Assertions.assertEquals(alertPage.getResult(), "You successfully clicked an alert", "Result text incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertPage = homePage.clickAlertsPage();
        alertPage.triggerConfirm();
        String text = alertPage.alert_getText();
        alertPage.alert_clickToDismiss();
        Assertions.assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        var alertPage = homePage.clickAlertsPage();
        alertPage.triggerPrompt();

        String text = "123";
        alertPage.alert_setInput(text);
        alertPage.alert_clickToAccept();
        Assertions.assertEquals(alertPage.getResult(), "You entered: " + text, "Result text incorrect");

    }
}
