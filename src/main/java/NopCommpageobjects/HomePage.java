package NopCommpageobjects;

import NopCommIndia.Utils;
import org.openqa.selenium.By;

/**
 * Created by Asus on 26/05/2015.
 */
public class HomePage extends BasePage {
    By loginemailField=By.id("Email");
    By passwordField=By.id("Password");
    By loginbutton=By.xpath("//input[@value='Log in']");
    By registerlink=By.linkText("Register");
    By logoutbutton=By.linkText("Log out");
    By loginField=By.linkText("Log in");

    public void logIn(String username,String password){
        Utils.click(loginField);
        Utils.enterText(loginemailField,username);
        Utils.enterText(passwordField,password);
        Utils.click(loginbutton);
    }

    public void logOut(){
        Utils.click(logoutbutton);
    }

    public void gotoregisterField(){
        Utils.click(registerlink);
    }
}
