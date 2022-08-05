package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import stepdefs.Prerequisite;

public class FilterPage extends Prerequisite {

    AndroidDriver<MobileElement> androidDriver ;
    public  FilterPage(AndroidDriver<MobileElement> androidDriver) {
        this.androidDriver= androidDriver;
    }
    public void clickOnFilter(){
        MobileElement filterIcon=androidDriver.findElementByXPath("//*[contains(@text,'Filter')]");
        filterIcon.click();
    }
    public void applyFilter(){
        MobileElement applyBisnis=androidDriver.findElementByXPath("//*[contains(@text,'Bisnis')]");
        applyBisnis.click();

//        MobileElement applyPangan=androidDriver.findElementByXPath("//*[contains(@text,'BRAWIJAYA')]");
//        applyPangan.click();
//
//        MobileElement eksekutif=androidDriver.findElementByXPath("//*[contains(@text,'JAYABAYA')]");
//        eksekutif.click();

        MobileElement ekonomi=androidDriver.findElementByXPath("//*[contains(@text,'Ekonomi')]");
        ekonomi.click();

    }
    public void setApply(){
        MobileElement apply=androidDriver.findElementByXPath("//*[contains(@text,'TERAPKAN')]");
        apply.click();
    }
    public void clickOnTrain(){
        MobileElement train=androidDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.Button");
        train.click();
    }


}
