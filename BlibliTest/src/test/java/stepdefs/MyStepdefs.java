package stepdefs;

import actions.CheckOutPageAction;
import actions.FilterPageAction;
import actions.TrainPageAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class MyStepdefs extends Prerequisite {
    static AndroidDriver<MobileElement> androidDriver ;
    @Given("open the app")
    public void openTheApp() throws Exception {
     prerequisite();
     androidDriver=super.getDriver();

    }

    @When("click on travel option")
    public void clickOnTravelOption() throws InterruptedException {
        TrainPageAction trainPageAction=new TrainPageAction(androidDriver);
        trainPageAction.onTravel();
        
    }

    @Then("Display the travel option")
    public void displayTheTravelOption() throws InterruptedException {
       TrainPageAction trainPageAction=new TrainPageAction(androidDriver);
       trainPageAction.assertTravel();
    }

    @And("Click on train option")
    public void clickOnTrainOption() {
        TrainPageAction trainPageAction=new TrainPageAction(androidDriver);
        trainPageAction.onTrain();
    }


    @Given("To enter all the details to be asked")
    public void toEnterAllTheDetailsToBeAsked() throws InterruptedException {
        TrainPageAction trainPageAction=new TrainPageAction(androidDriver);
        trainPageAction.enterDetails();

    }
    @And("click search button")
    public void clickSearchButton() {
        TrainPageAction trainPageAction=new TrainPageAction(androidDriver);
        trainPageAction.searchOption();
    }
    @Then("Departure Journey page appears")
    public void departureJourneyPageAppears() {
        System.out.println("departureJourneyPageAppears");
    }

    @When("user clicks Filter")
    public void userClicksFilter() {
        FilterPageAction filterPageAction=new FilterPageAction(androidDriver);
        filterPageAction.onFilter();

    }

    @And("Applies Filter")
    public void appliesFilter() {
        FilterPageAction filterPageAction=new FilterPageAction(androidDriver);
        filterPageAction.applyFilterForTrain();
    }
    @Then("List of Filtered Train would appear")
    public void listOfFilteredTrainWouldAppear() {
        FilterPageAction filterPageAction=new FilterPageAction(androidDriver);
        filterPageAction.setApply();
    }

    @When("user clicks on Desired Train")
    public void userClicksOnDesiredTrain() {
        FilterPageAction filterPageAction=new FilterPageAction(androidDriver);
        filterPageAction.clickOnTrain();
    }

    @Then("checkout page appears")
    public void checkoutPageAppears() throws InterruptedException {
        CheckOutPageAction checkOutPageAction=new CheckOutPageAction(androidDriver);
        checkOutPageAction.getTrainDetails();
    }

    @When("user enters the contact details")
    public void userEntersTheContactDetails() throws InterruptedException {
        CheckOutPageAction checkOutPageAction=new CheckOutPageAction(androidDriver);
        checkOutPageAction.getContactDetails();
    }

    @Then("Payment page appears")
    public void paymentPageAppears() throws InterruptedException {
        CheckOutPageAction checkOutPageAction=new CheckOutPageAction(androidDriver);
        checkOutPageAction.getPaymentDetails();
    }

    @When("user enters the personal details and id")
    public void userEntersThePersonalDetailsAndId() throws InterruptedException {
        CheckOutPageAction checkOutPageAction=new CheckOutPageAction(androidDriver);
        checkOutPageAction.personalDetails();


    }

    @Then("user sees the order page")
    public void userSeesTheOrderPage() throws InterruptedException {
        CheckOutPageAction checkOutPageAction=new CheckOutPageAction(androidDriver);
        checkOutPageAction.getOrderPage();

    }
}
