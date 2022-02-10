package pageobjects;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.forms.Form;
import helpers.ConfigProperties;
import helpers.DataGenerator;
import helpers.RobotUtils;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.KeyEvent;

public class InterestsPage extends Form {
    private ICheckBox interestsCheckBox = getElementFactory().getCheckBox(By.xpath("//label[@for='interest_" + ConfigProperties.get("interestsCheckBox") + "']"), "Unselect all checkboxes");
    private ICheckBox randomCheckBoxOne = getElementFactory().getCheckBox(By.xpath("(//span[@class='checkbox small'])["+DataGenerator.selectRandom()+"]"),"random checkbox");
    private ICheckBox randomCheckBoxTwo = getElementFactory().getCheckBox(By.xpath("(//span[@class='checkbox small'])["+DataGenerator.selectRandom()+"]"),"random checkbox");
    private ICheckBox randomCheckBoxThree = getElementFactory().getCheckBox(By.xpath("(//span[@class='checkbox small'])["+DataGenerator.selectRandom()+"]"),"random checkbox");
    private IButton nextBtn = getElementFactory().getButton(By.xpath("//button[normalize-space()='Next']"), "NEXT button");
    private IButton uploadBtn = getElementFactory().getButton(By.xpath("//a[normalize-space()='upload']"), "upload button");
    public InterestsPage() {
        super(By.xpath("//h2[normalize-space()='Choose 3 interests']"), "Label 'Choose 3 interests' ");
    }
    public void selectInterests()  {
                interestsCheckBox.check();
                randomCheckBoxOne.check();
                randomCheckBoxTwo.check();
                randomCheckBoxThree.check();
    }

    public void uploadImage()  {
        uploadBtn.click();
        /*
        копипаст из буфера обмена. Как лучше сделать, не знаю
         */

        RobotUtils.copyPasteByRobo();
        nextBtn.click();
    }

}