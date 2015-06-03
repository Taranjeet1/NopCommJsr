package NopCommIndia;

import NopCommpageobjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Asus on 26/05/2015.
 */
public class Utils extends BasePage {

    public static void maximizePage() {
        driver.manage().window().maximize();
    }

    public static void ClickLink(String link) {
        driver.findElements(By.linkText(link));
    }

    public static void waitforpagetoLoad(int time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

    }

    public static void click(By knock) {
        driver.findElement(knock).isDisplayed();
        driver.findElement(knock).click();
    }

    public static void enterText(By element, String text) {
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(text);
    }

    public static void selectFrom(By element, String text) {
        Select select = new Select(driver.findElement(element));
        select.selectByVisibleText(text);
    }

    public static boolean isTextPresent(String text) {
        return driver.findElement(By.tagName("body")).getText().contains(text);
    }

    public static String randomdate(){
        DateFormat dateformat=new SimpleDateFormat("yyyyMMddHHmmss");
        return dateformat.format(new Date());
    }
   public static String getText(By by){
       return driver.findElement(by).getText();
   }

}
