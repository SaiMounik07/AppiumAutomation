package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ScreenshotState;
import io.appium.java_client.android.AndroidDriver;
import stepdefs.Prerequisite;

public class CheckOutPage extends Prerequisite {
    AndroidDriver<MobileElement> androidDriver;
    public  CheckOutPage(AndroidDriver<MobileElement> androidDriver) {
        this.androidDriver= androidDriver;
    }
    public void checkTrain() throws InterruptedException {
        MobileElement trainSelect=  androidDriver.findElementByXPath("//*[contains(@text,'Nona')]");
        trainSelect.click();
        Thread.sleep(2000);
    }
    public void contactDetails() throws InterruptedException {
//        MobileElement setName=androidDriver.findElementByXPath("//*[contains(@text,'Full Name')]");
//        setName.sendKeys("Mounik");
        MobileElement setPhone=androidDriver.findElementByXPath("//*[contains(@text,'Nomor HP')]");
        setPhone.sendKeys("6381977357");
//        MobileElement setEmail=androidDriver.findElementByXPath("//*[contains(@text,'Email Address')]");
//        setEmail.sendKeys("sai.mounik@gmail.com");
        Thread.sleep(2000);
    }


    public void paymentDetails() throws InterruptedException {
        MobileElement clickEnter=androidDriver.findElementByXPath("//*[contains(@text,'Isi Data Penumpang')]");
        clickEnter.click();
        MobileElement langutkan=androidDriver.findElementByXPath("//*[contains(@text,'Lanjutkan')]");
        langutkan.click();
        Thread.sleep(5000);
    }


    public void personalDetails() {
        MobileElement setBuyerName=androidDriver.findElementByXPath("//*[contains(@text,'Sama dengan pemesan')]");
        setBuyerName.click();

//        MobileElement identityType=androidDriver.findElementByXPath("//*[contains(@text,'Tipe identitas')]");
//        identityType.click();
//
//        MobileElement identityType1=androidDriver.findElementByXPath("//*[contains(@text,'KTP/Kartu Keluarga')]");
//        identityType1.click();

        MobileElement setId=androidDriver.findElementByXPath("//*[contains(@text,'Nomor identitas')]");
        setId.sendKeys("3313091704330001");

    }


    public void orderPage() {
        MobileElement clicksimpan=androidDriver.findElementByXPath("//*[contains(@text,'Simpan')]");
        clicksimpan.click();
        MobileElement lanjutkan=androidDriver.findElementByXPath("//*[contains(@text,'Lanjutkan pembayaran')]");
        lanjutkan.click();

    }


}
