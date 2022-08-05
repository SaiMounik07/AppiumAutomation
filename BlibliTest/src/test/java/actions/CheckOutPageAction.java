package actions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import pages.CheckOutPage;
import pages.FilterPage;

public class CheckOutPageAction {

    CheckOutPage checkOutPage;
    public CheckOutPageAction(AndroidDriver<MobileElement> androidDriver)
    {
        checkOutPage=new CheckOutPage(androidDriver);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),CheckOutPage.class);
    }
    public void getTrainDetails() throws InterruptedException {
        checkOutPage.checkTrain();
    }
    public void getContactDetails() throws InterruptedException {
        checkOutPage.contactDetails();
    }
    public void getPaymentDetails() throws InterruptedException {
        checkOutPage.paymentDetails();
    }
    public void personalDetails(){
        checkOutPage.personalDetails();
    }

    public void getOrderPage(){
        checkOutPage.orderPage();
    }




}
