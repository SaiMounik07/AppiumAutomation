package actions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import pages.FilterPage;
import pages.TrainPage;

public class FilterPageAction {
    FilterPage filterPage;
    public FilterPageAction(AndroidDriver<MobileElement> androidDriver)
    {
        filterPage=new FilterPage(androidDriver);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),FilterPage.class);

    }
    public void onFilter(){
        filterPage.clickOnFilter();

    }
    public void applyFilterForTrain(){
    filterPage.applyFilter();

    }
    public void setApply(){
        filterPage.setApply();

    }
    public void clickOnTrain(){
        filterPage.clickOnTrain();
    }
}
