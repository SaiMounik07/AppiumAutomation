package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import stepdefs.Prerequisite;
import java.util.List;


public class TrainPage extends Prerequisite {
    AndroidDriver<MobileElement> androidDriver1 ;
    public TrainPage(AndroidDriver<MobileElement> androidDriver) {
        androidDriver1 = androidDriver;
    }
    public void clickOnTravel() throws InterruptedException {
        MobileElement travelOption=androidDriver1.findElement(By.xpath("//*[@text='Baru']"));

        travelOption.click();
    Thread.sleep(3000);
}
public void assertPage(){

     MobileElement travel1=androidDriver1.findElementByXPath("//*[@text='Travel']");
     travel1.click();


    List<MobileElement>
            speakCheck = androidDriver1.findElements(By.xpath("//*[@text='Travel']"));

    //Assert.assertEquals("Label Data Mismatch", speakCheck.getText().trim(), "Blibli Travel");
    speakCheck.get(2).click();
    //MobileElement speakCheck1 = androidDriver1.findElementById("blibli.mobile.commerce:id/tv_item_name");



}

    public void clickOnTrain() {
        MobileElement trainOption=androidDriver1.findElementByXPath("//*[@text='Train']");
        trainOption.click();
    }
    public void enterAllTheDetails() throws InterruptedException {
//        MobileElement source=androidDriver1.findElementByXPath("//*[@text='Jakarta']");
//
//        MobileElement destination=androidDriver1.findElementByXPath("//*[@text='Jakarta']");

//        MobileElement travelOption2=androidDriver1.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[4]");
//
//        MobileElement travelOption3=androidDriver1.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView");

        MobileElement date=androidDriver1.findElementByXPath("//*[contains(@text,'04 Agt 2022')]");
        date.click();

        MobileElement setDate=androidDriver1.findElementByXPath("//*[contains(@text,'5')]");
//
//        source.click();
//
//        destination.click();

//        travelOption2.click();
//
//        travelOption3.click();

        setDate.click();

    }
    public void setSearchButton(){
        MobileElement searchButton=androidDriver1.findElementByXPath("//*[contains(@text,'Cari')]");

        searchButton.click();
    }

}
