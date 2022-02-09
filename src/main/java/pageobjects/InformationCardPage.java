package pageobjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import helpers.ConfigProperties;
import helpers.DataGenerator;
import org.openqa.selenium.By;

public class InformationCardPage extends Form {

    private ITextBox passwordBox = getElementFactory().getTextBox(By.xpath("//input[@placeholder='Choose Password']"), "Password box");
    private ITextBox emailBox = getElementFactory().getTextBox(By.xpath("//input[@placeholder='Your email']"), "email Box");
    private ITextBox domainBox = getElementFactory().getTextBox(By.xpath("//input[@placeholder='Domain']"), "domain Box");
    private IComboBox dropdownField = getElementFactory().getComboBox(By.xpath("//div[@class='dropdown__field']"), "dropDown Field");
    private ICheckBox termsConditionsChkBx = getElementFactory().getCheckBox(By.xpath("//span[@class='icon icon-check checkbox__check']"), "terms and Conditions ChkBx");
    private IButton nextBtn = getElementFactory().getButton(By.xpath("//a[normalize-space()='Next']"),"next button");
    private IButton selectFromDropDown = getElementFactory().getButton(By.xpath("//div[normalize-space()='" + ConfigProperties.get("domain") + "']"), "выбор домена после точки");



    public InformationCardPage() {
        super(By.xpath("//input[@placeholder='Choose Password']"), "Field for entering password");
    }

    public void fillRegistrationForm(){
        passwordBox.clearAndType(DataGenerator.createPassword());
        emailBox.clearAndType(DataGenerator.createString());
        domainBox.clearAndType(DataGenerator.createString());
        dropdownField.click();
        selectFromDropDown.click();
        termsConditionsChkBx.check();
        nextBtn.click();



    }




}
