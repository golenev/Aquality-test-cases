import helpers.ConfigProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.InformationCardPage;
import pageobjects.InterestsPage;
import pageobjects.WelcomePage;


public class UITests extends BaseTest{

    private final WelcomePage welcomePage = new WelcomePage();
    private final InformationCardPage informationCardPage = new InformationCardPage();
    private final InterestsPage interestsPage = new InterestsPage();

    @Test
    public void firstCase() {
       Assert.assertTrue(welcomePage.state().isDisplayed(),"Error. This page is not displayed");
        welcomePage.clickNext();
        Assert.assertTrue(informationCardPage.state().isDisplayed(),"Error. This page is not displayed");
        informationCardPage.fillRegistrationForm();
        Assert.assertTrue(interestsPage.state().isDisplayed(),"Error. This page is not displayed");
        interestsPage.selectInterests();
        interestsPage.uploadImage();
    }

    @Test
    public  void secondCase(){
        Assert.assertTrue(welcomePage.state().isDisplayed(),"Error. This page is not displayed");
        welcomePage.clickNext();
        welcomePage.hideForm();
        Assert.assertTrue(welcomePage.checkStateForm(),"Sorry, form is still displayed");
    }

    @Test
    public void thirdCase(){
        Assert.assertTrue(welcomePage.state().isDisplayed(),"Error. This page is not displayed");
        welcomePage.clickNext();
        welcomePage.confirmCookies();
        Assert.assertTrue(welcomePage.checkStateCookies(),"Sorry, the cookies form is still displayed");
    }
    @Test
    public void fourthCase(){
        Assert.assertTrue(welcomePage.state().isDisplayed(),"Error. This page is not displayed");
        welcomePage.clickNext();
        Assert.assertEquals(welcomePage.getInfoFromTimer(), "00:00:00");
    }

}
