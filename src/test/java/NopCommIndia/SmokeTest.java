package NopCommIndia;

import NopCommpageobjects.*;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by Asus on 26/05/2015.
 */
public class SmokeTest extends BaseTest {

    //Registration data

    String firstname = LoadProperties.getProperty("firstname");
    String lastname = LoadProperties.getProperty("lastname");
    String dateofbirth = LoadProperties.getProperty("dateofbirth");
    String monthofbirth = LoadProperties.getProperty("monthofbirth");
    String yearborn = LoadProperties.getProperty("yearborn");
    String email = LoadProperties.getProperty("email") + Utils.randomdate() + "@gmail.com";
    String confirmpassword = LoadProperties.getProperty("confirmpassword");
    String password = LoadProperties.getProperty("password");
    String registrationsuccessmessage = LoadProperties.getProperty("registrationsuccessmessage");
    String emailsend=LoadProperties.getProperty("emailsend");

    //existing user login email
    By generatedemail = By.xpath("//a[@class='account']");

    //Electronics data
    String electronicsPage = LoadProperties.getProperty("electronicspage");
    String lowtohigh = LoadProperties.getProperty("lowtohigh");

    //location to send product
    String countryname = LoadProperties.getProperty("countryname");

    //Assertion
   // String billingpage = LoadProperties.getProperty("billingpage");

    //Billing data
    String country = LoadProperties.getProperty("country");
    String city = LoadProperties.getProperty("city");
    String address1 = LoadProperties.getProperty("address1");
    String zip = LoadProperties.getProperty("zip");
    String phonenumber = LoadProperties.getProperty("phonenumber");

    //Books data
    String hightolow = LoadProperties.getProperty("hightolow");
    String list = LoadProperties.getProperty("list");

    //Apparel and Shoes data

    String type=LoadProperties.getProperty("type");
    String namesAtoZ=LoadProperties.getProperty("namesAtoZ");
    String friendemail=LoadProperties.getProperty("friendemail");
    String myemail=LoadProperties.getProperty("myemail");
    String personalmsg=LoadProperties.getProperty("personalmsg");


    //Assert
    String billingpage = LoadProperties.getProperty("billingpage");
    String books = LoadProperties.getProperty("books");
    String numberofitemsincart = LoadProperties.getProperty("numberofitemsincart");
    String shoppingcart = LoadProperties.getProperty("shoppingcart");
    String numberofitemsincart1 = LoadProperties.getProperty("numberofitemsincart1");
    String itemadded=LoadProperties.getProperty("itemadded");
    String apparelandshoe=LoadProperties.getProperty("apparelandshoe");
    String seconditemadded=LoadProperties.getProperty("seconditemadded");

    //delivery location data
    String countryname1 = LoadProperties.getProperty("countryname1");
    String countryname2=LoadProperties.getProperty("countryname2");

    //Login data

    String email1 = LoadProperties.getProperty("email");

    // Objects created for Class

    ElectronicsPage electronicspage = new ElectronicsPage();
    HomePage homePage = new HomePage();
    CheckoutPage checkoutPage = new CheckoutPage();
    RegisterPage registerPage = new RegisterPage();
    BooksPage bookspage = new BooksPage();
    ApparelandShoesPage apparel=new ApparelandShoesPage();


    @Test
    public void userbuyingCamera() {

        homePage.gotoregisterField();
        registerPage.registerAcoount(firstname, lastname, dateofbirth, monthofbirth, yearborn, email, password, confirmpassword);
        assertTrue(Utils.isTextPresent(registrationsuccessmessage));
        String useremail = Utils.getText(generatedemail);
        homePage.logOut();
        homePage.logIn(useremail, password);
        electronicspage.gotoElectronics();
        assertTrue(Utils.isTextPresent(electronicsPage));
        electronicspage.clickCamera();
        electronicspage.selectProduct(lowtohigh);
        checkoutPage.selectdeliveryLocation(countryname);
        assertTrue(Utils.isTextPresent(billingpage));
        checkoutPage.checkout(country, city, address1, zip, phonenumber);

    }


    @Test
    public void usercanbuyBooks() {
        homePage.gotoregisterField();
        registerPage.registerAcoount(firstname, lastname, dateofbirth, monthofbirth, yearborn, email, password, confirmpassword);
        assertTrue(Utils.isTextPresent(registrationsuccessmessage));
        String useremail = Utils.getText(generatedemail);
        homePage.logOut();
        homePage.logIn(useremail, password);
        bookspage.gotoBooks();
        assertTrue(Utils.isTextPresent(books));
        bookspage.selectBooks(hightolow);
        assertTrue(Utils.isTextPresent(numberofitemsincart));
        assertTrue(Utils.isTextPresent(shoppingcart));
        bookspage.deleteItem();
        assertTrue(Utils.isTextPresent(numberofitemsincart1));
        checkoutPage.selectdeliveryLocation(countryname1);
        assertTrue(Utils.isTextPresent(billingpage));
        checkoutPage.checkout(country, city, address1, zip, phonenumber);


    }
    @Test
    public void sendemailtoFriend(){
        homePage.gotoregisterField();
        registerPage.registerAcoount(firstname, lastname, dateofbirth, monthofbirth, yearborn, email, password, confirmpassword);
        assertTrue(Utils.isTextPresent(registrationsuccessmessage));
        String useremail = Utils.getText(generatedemail);
        homePage.logOut();
        homePage.logIn(useremail, password);
        apparel.gotoapparelsandShoes();
        apparel.selectappandshoe(namesAtoZ,type);
        assertTrue(Utils.isTextPresent(itemadded));
        apparel.gotoapparelsandShoes();
        assertTrue(Utils.isTextPresent(apparelandshoe));
        apparel.clickNext();
        assertTrue(Utils.isTextPresent(seconditemadded));
        apparel.emailtofriend(friendemail,myemail,personalmsg);
        assertTrue(Utils.isTextPresent(emailsend));
        apparel.clickshoppingcart();
        checkoutPage.selectdeliveryLocation(countryname2);
        checkoutPage.checkout(country,city,address1,zip,phonenumber);






    }


}






