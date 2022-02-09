package pageobjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import helpers.RegExHelper;
import org.openqa.selenium.By;

import java.time.Duration;

public class WelcomePage extends Form {

    private IButton btnHere = getElementFactory().getButton(By.xpath("//a[normalize-space()='HERE']"), "HERE button");
    private IButton hideFormBtn = getElementFactory().getButton(By.xpath("//span[@class='discrete']"),"Send to bottom");
    private IButton confirmCookiesBtn = getElementFactory().getButton(By.xpath("//button[normalize-space()='Not really, no']"),"Confirm cookies");
    private ITextBox timerData = getElementFactory().getTextBox(By.xpath("//div[@class='timer timer--white timer--center']"),"timer");


    public WelcomePage() {
        super(By.xpath("//a[normalize-space()='HERE']"), "HERE button");
    }



    public void clickNext(){
        btnHere.click();
    }
    public void hideForm(){
        hideFormBtn.click();
    }
    public void confirmCookies(){
        confirmCookiesBtn.click();
    }
    public String getInfoFromTimer(){
       return timerData.getText();
    }
    public boolean checkStateForm(){
       return hideFormBtn.state().waitForNotDisplayed(Duration.ofMillis(3000));
    }
    public boolean checkStateCookies(){
        return confirmCookiesBtn.state().waitForNotDisplayed(Duration.ofMillis(12000));
    }



}
