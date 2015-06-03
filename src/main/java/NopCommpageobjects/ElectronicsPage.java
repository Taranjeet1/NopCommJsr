package NopCommpageobjects;

import NopCommIndia.Utils;
import org.openqa.selenium.By;

/**
 * Created by Asus on 26/05/2015.
 */
public class ElectronicsPage extends BasePage {

      By electronics=By.linkText("Electronics");
      By camera=By.xpath("//div[4]/div/div/div[2]/ul/li[3]/ul/li/a");
      By sortby=By.id("products-orderby");
      By chosenproduct=By.linkText("Canon VIXIA HF100 Camcorder");
      By addtocart=By.id("add-to-cart-button-20");
      By shoppingcart=By.xpath("//li[@id='topcartlink']/a/span");


      public void gotoElectronics(){
          Utils.click(electronics);
      }
      public void clickCamera(){
          Utils.click(camera);
      }

      public void selectProduct(String text){
          Utils.selectFrom(sortby,text);
          Utils.click(chosenproduct);
          Utils.click(addtocart);
          Utils.click(shoppingcart);

                }


    }


