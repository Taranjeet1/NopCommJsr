package NopCommIndia;

import NopCommpageobjects.BasePage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by Asus on 26/05/2015.
 */
public class BaseTest extends BasePage {
    String url=LoadProperties.getProperty("URL");

@BeforeClass

    public void openBrowser(){

    driver= new FirefoxDriver();
    driver.get(url);
    Utils.waitforpagetoLoad(10);
    Utils.maximizePage();
}

//@AfterClass

    public void closeBrowser(){
    driver.quit();
}
}
