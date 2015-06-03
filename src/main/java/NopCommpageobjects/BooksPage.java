package NopCommpageobjects;

import NopCommIndia.Utils;
import org.openqa.selenium.By;

/**
 * Created by Asus on 28/05/2015.
 */
public class BooksPage extends BasePage {

    By books=By.linkText("Books");
    By sortby= By.id("products-orderby");
    //By view=By.id("products-viewmode");
    By eatingwell=By.linkText("EatingWell in Season");
    By grillingrecipes=By.linkText("Best Grilling Recipes");
    By addtocart=By.id("add-to-cart-button-27");
    By addtocart1=By.id("add-to-cart-button-13");
    By shoppingcart=By.xpath("//li[@id='topcartlink']/a");
    By itemtodelete=By.xpath("//input[@name='removefromcart']");
    By updatecart=By.xpath("//input[@value='Update shopping cart']");


    public void gotoBooks(){
        Utils.click(books);
    }

    public void selectBooks(String text){
        Utils.selectFrom(sortby,text);
       // Utils.selectFrom(view,text);
        Utils.click(eatingwell);
        Utils.click(addtocart);
        Utils.click(books);
        Utils.click(grillingrecipes);
        Utils.click(addtocart1);
        Utils.click(shoppingcart);
    }

    public void deleteItem(){
        Utils.click(itemtodelete);
        Utils.click(updatecart);
    }


}
