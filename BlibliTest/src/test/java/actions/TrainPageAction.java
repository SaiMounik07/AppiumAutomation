package actions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import pages.FilterPage;
import pages.TrainPage;
import stepdefs.Prerequisite;

public class TrainPageAction {
    TrainPage trainPage;

    public TrainPageAction(AndroidDriver<MobileElement> androidDriver)
    {
       trainPage=new TrainPage(androidDriver);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),TrainPage.class);

    }


    public void onTravel() throws InterruptedException {
        trainPage.clickOnTravel();
    }
    public void assertTravel() throws InterruptedException {
        trainPage.assertPage();
    }
    public void onTrain(){
        trainPage.clickOnTrain();
    }
    public void enterDetails() throws InterruptedException {
        trainPage.enterAllTheDetails();
    }
    public void searchOption(){
        trainPage.setSearchButton();
    }
}

