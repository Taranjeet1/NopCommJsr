package NopCommpageobjects;

import NopCommIndia.Utils;
import org.openqa.selenium.By;

/**
 * Created by Asus on 26/05/2015.
 */
public class RegisterPage extends BasePage {
    By female = By.id("gender-female");
    By male = By.id("gender-male");
    By firstnameField = By.id("FirstName");
    By lastnameField=By.id("LastName");
    By birthdayfield=By.name("DateOfBirthDay");
    By birthmonthfield=By.name("DateOfBirthMonth");
    By yearmonthfield=By.name("DateOfBirthYear");
    By emailfield=By.id("Email");
    By passwordfield=By.id("Password");
    By confirmpasswordfield=By.id("ConfirmPassword");
    By registerbutton=By.id("register-button");
    By continuefield=By.xpath("//input[@valuse='Continue']");


    public void registerAcoount(String firstname, String lastname, String dateofbirth, String monthofbirth, String yearborn, String email, String password, String confirmpassword) {
        {
            Utils.click(female);
            Utils.click(male);
            Utils.enterText(firstnameField, firstname);
            Utils.enterText(lastnameField, lastname);
            Utils.selectFrom(birthdayfield,dateofbirth);
            Utils.selectFrom(birthmonthfield,monthofbirth);
            Utils.selectFrom(yearmonthfield,yearborn);
            Utils.enterText(emailfield,email);
            Utils.enterText(passwordfield, password);
            Utils.enterText(confirmpasswordfield, confirmpassword);
            Utils.click(registerbutton);
        }
    }
}