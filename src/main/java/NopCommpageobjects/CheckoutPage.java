package NopCommpageobjects;

import NopCommIndia.Utils;
import org.openqa.selenium.By;

/**
 * Created by Asus on 26/05/2015.
 */
public class CheckoutPage extends BasePage {

    By countrylist = By.name("BillingNewAddress.CountryId");
    By cityfield = By.id("BillingNewAddress_City");
    By addressfield = By.id("BillingNewAddress_Address1");
    By zipfield = By.id("BillingNewAddress_ZipPostalCode");
    By phonenumberfield = By.id("BillingNewAddress_PhoneNumber");
    By oncontinue = By.xpath("//input[@value='Continue']");
    By storepickup = By.id("PickUpInStore");
    By oncontinue1 = By.xpath("//div[@id='shipping-buttons-container']/input");
    By creditcard = By.id("paymentmethod_1");
    By creditcarddetails = By.xpath("//div[@id='payment-method-buttons-container']/input");
    By country = By.id("CountryId");
    By termsagreed = By.id("termsofservice");
    By checkout = By.id("checkout");

    public void checkout(String country, String city, String address1, String zip, String phonenumber) {

        Utils.selectFrom(countrylist, country);
        Utils.enterText(cityfield, city);
        Utils.enterText(addressfield, address1);
        Utils.enterText(zipfield, zip);
        Utils.enterText(phonenumberfield, phonenumber);
        Utils.click(oncontinue);
        Utils.click(storepickup);
        Utils.click(oncontinue1);
        Utils.click(creditcard);
        Utils.click(creditcarddetails);
    }

    public void selectdeliveryLocation(String text) {
        Utils.selectFrom(country, text);
        Utils.click(termsagreed);
        Utils.click(checkout);
    }
}