package NopCommpageobjects;

import NopCommIndia.Utils;
import org.openqa.selenium.By;

/**
 * Created by Asus on 28/05/2015.
 */
public class ApparelandShoesPage extends BasePage {

    By apparelandshoes= By.linkText("Apparel & Shoes");
    By sortby=By.id("products-orderby");
    By tshirt=By.linkText("Custom T-Shirt");
    By addtocart=By.id("add-to-cart-button-24");
    By enteryourtextField=By.id("product_attribute_24_2_9");
    By shoppingcart=By.xpath("//li[@id='topcartlink']/a/span");
    By nikebelt=By.linkText("NIKE Golf Casual Belt");
    By addbelt=By.id("add-to-cart-button-40");
    By emailbuton=By.xpath("//input[@value='Email a friend']");
    By friendemailfield=By.id("FriendEmail");
    By myemailfield=By.id("YourEmailAddress");
    By personalmsgfield=By.id("PersonalMessage");
    By sendemail=By.xpath("//input[@value='Send email']");



    By next=By.linkText("Next");


    public void gotoapparelsandShoes(){
        Utils.click(apparelandshoes);
    }

    public void selectappandshoe(String text,String type){
        Utils.selectFrom(sortby,text);
        Utils.click(tshirt);
        Utils.enterText(enteryourtextField, type);
        Utils.click(addtocart);


    }

    public void clickNext(){
        Utils.click(next);
        Utils.click(nikebelt);
        Utils.click(addbelt);
    }

    public void emailtofriend(String friendemail,String myemail,String personalmsg){
        Utils.click(emailbuton);
        Utils.enterText(friendemailfield,friendemail);
        Utils.enterText(myemailfield,myemail);
        Utils.enterText(personalmsgfield,personalmsg);
        Utils.click(sendemail);
    }

    public void clickshoppingcart(){
        Utils.click(shoppingcart);
    }


}
