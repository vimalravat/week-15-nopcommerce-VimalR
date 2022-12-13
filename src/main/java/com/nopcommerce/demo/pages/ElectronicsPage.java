package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends Utility {


        @CacheLookup
        @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]")
        WebElement mouseHooverOnElectronics;

        @CacheLookup
        @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]/ul/li[2]")
        WebElement cellphone;

        @CacheLookup
        @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
        WebElement textCellPhone1;

        @CacheLookup
        @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
        WebElement listView;

        @CacheLookup
        @FindBy(xpath = "//div[@class='details']//a[contains(text(),'Nokia Lumia 1020')]")
        WebElement  nameNokiaLumia;

        @CacheLookup
        @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
        WebElement nokiaLumia;

        @CacheLookup
        @FindBy(xpath = "//span[@id='price-value-20']")
        WebElement verifyText$349;

        @CacheLookup
        @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
        WebElement changeQuantity;

        @CacheLookup
        @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
        WebElement addToCart;

        @CacheLookup
        @FindBy(xpath = "//div[@id='bar-notification']/div/p")
        WebElement verifyTheProductHasBeenAddedmessage;

        @CacheLookup
        @FindBy(xpath = "//span[@class='close']")
        WebElement closeButton;

        @CacheLookup
        @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
        WebElement shoppingCart;
        @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
        WebElement clickOnIt;

        @CacheLookup
        @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
        WebElement verifyShoppingCart;

        @CacheLookup
        @FindBy(xpath = "//span[@class='product-subtotal']")
        WebElement verifyTotal$698;

        @CacheLookup
        @FindBy(id = "termsofservice")
        WebElement checkBox;

        @CacheLookup
        @FindBy(id = "checkout")
        WebElement checkOut;

        @CacheLookup
        @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
        WebElement welcomeMessage;

        @CacheLookup
        @FindBy(xpath = "//button[contains(text(),'Register')]")
        WebElement  registerTab;

        @CacheLookup
        @FindBy(xpath = "//h1[contains(text(),'Register')]")
        WebElement registerText;

        @CacheLookup
        @FindBy(xpath = "//input[@id='gender-female']")
        WebElement clickRadioBtn;

        @CacheLookup
        @FindBy(id = "FirstName")
        WebElement firstName;

        @CacheLookup
        @FindBy(id = "LastName")
        WebElement LastName;

        @CacheLookup
        @FindBy(id = "Email")
        WebElement email;

        @CacheLookup
        @FindBy(id = "Password")
        WebElement password;

        @CacheLookup
        @FindBy(id = "ConfirmPassword")
        WebElement confirmPassword;

        @CacheLookup
        @FindBy(id = "register-button")
        WebElement register1;

        @CacheLookup
        @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
        WebElement verifyMesssage;

        @CacheLookup
        @FindBy(xpath = "//a[@class='button-1 register-continue-button']")
        WebElement continueButton2;

        @CacheLookup
        @FindBy(xpath = "//h1[text()='Shopping cart']")
        WebElement getVerifyShoppingCart;

        @CacheLookup
        @FindBy(id = "termsofservice")
        WebElement checkBox1;

        @CacheLookup
        @FindBy(id = "termsofservice")
        WebElement Checkout;

        @CacheLookup
        @FindBy(id = "BillingNewAddress_CountryId")
        WebElement country;

        @CacheLookup
        @FindBy(id = "BillingNewAddress_City")
        WebElement city;

        @CacheLookup
        @FindBy(id = "BillingNewAddress_Address1")
        WebElement address1;

        @CacheLookup
        @FindBy(id = "BillingNewAddress_ZipPostalCode")
        WebElement zipPostalCode;

        @CacheLookup
        @FindBy(id = "BillingNewAddress_PhoneNumber")
        WebElement phoneNumber;

        @CacheLookup
        @FindBy(xpath = "//button[text() = 'Continue']")
        WebElement continueButton3;

        @CacheLookup
        @FindBy(id = "shippingoption_2")
        WebElement radiobutton1;

        @CacheLookup
        @FindBy(xpath = "//div[@id='shipping-method-buttons-container']/button")
        WebElement continueButton4;

        @CacheLookup
        @FindBy(xpath = "//input[@id='paymentmethod_1']")
        WebElement radiobutton2;

        @CacheLookup
        @FindBy(xpath = "//div[@id='checkout-step-payment-method']/div/button")
        WebElement paymentMethod;

        @CacheLookup
        @FindBy(xpath = "//select[@id='CreditCardType']")
        WebElement selectVisa;

        @CacheLookup
        @FindBy(id = "CardholderName")
        WebElement cardHolderName;

        @CacheLookup
        @FindBy(id = "CardNumber")
        WebElement cardNumber;

        @CacheLookup
        @FindBy(id = "ExpireMonth")
        WebElement selectExpireMonth;

        @CacheLookup
        @FindBy(id = "ExpireYear")
        WebElement selectExpireYear;

        @CacheLookup
        @FindBy(id = "CardCode")
        WebElement cardCode;

        @CacheLookup
        @FindBy(xpath = "//button[@onclick='PaymentInfo.save()']")
        WebElement continueCheckOut;

        @CacheLookup
        @FindBy(xpath = "//li[@class='payment-method']/span[2]")
        WebElement verifyMessage1;

        @CacheLookup
        @FindBy(xpath = "//li[@class='shipping-method']/span[2]")
        WebElement verifyMessage2;

        @CacheLookup
        @FindBy(xpath = "//td[@class='subtotal']/span")
        WebElement verifyMessage3;

        @CacheLookup
        @FindBy(xpath = "//button[contains(text(),'Confirm')]")
        WebElement clickConfirm;

        @CacheLookup
        @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
        WebElement verifyMessage4;

        @CacheLookup
        @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
        WebElement verifyMessage5;

        @CacheLookup
        @FindBy(xpath = "//button[contains(text(),'Continue')]")
        WebElement clickContinuee;

        @CacheLookup
        @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
        WebElement verifyMessage6;

        @CacheLookup
        @FindBy(xpath = "//a[contains(text(),'Log out')]")
        WebElement clickonLogout;


        public void electronicsPage() {
                CustomListeners.test.log(Status.PASS, "electronicsPage" );

            mouseHoverToElement(mouseHooverOnElectronics);
        }
        public void setMouseHooverOnCellPhone() {
                CustomListeners.test.log(Status.PASS, "setMouseHooverOnCellPhone" );
            mouseHoverToElementAndClick(cellphone);
        }
        public String cellPhone() {
                CustomListeners.test.log(Status.PASS, "continue3" );
            return getTextFromElement(textCellPhone1);
        }


        public void listView() {
                CustomListeners.test.log(Status.PASS, "listView" );
            clickOnElement(listView);
        }
        public void nokiaLumia() {
                CustomListeners.test.log(Status.PASS, "nokiaLumia" );
            clickOnElement(nameNokiaLumia);
        }
        public String nokiaLumia1() {
                CustomListeners.test.log(Status.PASS, "nokiaLumia1" );
            return getTextFromElement(nokiaLumia);
        }
        public String verifyText1$349() {
                CustomListeners.test.log(Status.PASS, "verifyText1$349" );
            return getTextFromElement(verifyText$349);
        }
//        public void changeQuntity1() {
//
//            clearAndEnterQuantity(changeQuantity, "2");
//
//        }



        public void addToCart() {
                CustomListeners.test.log(Status.PASS, "addToCart" );
            clickOnElement(addToCart);
        }
        public String message1() {
                CustomListeners.test.log(Status.PASS, "message1" );
            return getTextFromElement(verifyTheProductHasBeenAddedmessage);
        }
        public void closeButton() {
                CustomListeners.test.log(Status.PASS, "closeButton" );
            clickOnElement(closeButton);
        }
        public void clickOnShoppingCart(){
                CustomListeners.test.log(Status.PASS, "clickOnShoppingCart" );
            mouseHoverToElementAndClick(shoppingCart);
            clickOnElement(clickOnIt);
        }
        public String verifyShoppingCart() {
                CustomListeners.test.log(Status.PASS, "verifyShoppingCart" );
            return getTextFromElement(verifyShoppingCart);
        }
        public String totalText698 () {
                CustomListeners.test.log(Status.PASS, "totalText698" );
            return getTextFromElement(verifyTotal$698);
        }
        public void checkBox() {
                CustomListeners.test.log(Status.PASS, "checkBox" );
            clickOnElement(checkBox);
        }

        public void checkOut() {
                CustomListeners.test.log(Status.PASS, "checkOut" );
            clickOnElement(checkOut);
        }

        public String welcomeMessage1 () {
                CustomListeners.test.log(Status.PASS, "welcomeMessage1" );
            return getTextFromElement(welcomeMessage);
        }

        public void registerTab() {
                CustomListeners.test.log(Status.PASS, "registerTab" );
            clickOnElement(registerTab);
        }

        public String registerText () {
                CustomListeners.test.log(Status.PASS, "registerText" );
            return getTextFromElement(registerText);
        }

        public void clickOnRadioButton(){
                CustomListeners.test.log(Status.PASS, "clickOnRadioButton" );
            clickOnElement(clickRadioBtn);
        }

        public void enterFirstname(String text) {
                CustomListeners.test.log(Status.PASS, "enterFirstname" );
            sendTextToElement(firstName, text);
        }

        public void enterLastname(String text) {
                CustomListeners.test.log(Status.PASS, "enterLastname" );
            sendTextToElement(LastName, text);
        }

        public void enterEmail1(String text) {
                CustomListeners.test.log(Status.PASS, "enterEmail1" );
            sendTextToElement(email, text);
        }

        public void enterPassword(String text){
                CustomListeners.test.log(Status.PASS, "enterPassword" );
            sendTextToElement(password,text);
        }

        public void enterConfirmPassword(String text){
                CustomListeners.test.log(Status.PASS, "continue3" );
            sendTextToElement(confirmPassword,text);
        }

        public void registerButton1(){
                CustomListeners.test.log(Status.PASS, "registerButton1" );
            clickOnElement(register1);
        }

        public String verifyMessaage() {
                CustomListeners.test.log(Status.PASS, "verifyMessaage" );
            return getTextFromElement(verifyMesssage);
        }

        public void continueB(){
                CustomListeners.test.log(Status.PASS, "continueB" );
            clickOnElement(continueButton2);
        }

        public String shoppingCart1 () {
                CustomListeners.test.log(Status.PASS, "shoppingCart1" );
            return getTextFromElement(getVerifyShoppingCart);
        }

        public void setCheckBox2(){
                CustomListeners.test.log(Status.PASS, "setCheckBox2" );
            clickOnElement(checkBox1);
        }

        public void checkout3(){
                CustomListeners.test.log(Status.PASS, "continue3" );
            clickOnElement(checkOut);
        }

        public void enterCountry(String text) {
                CustomListeners.test.log(Status.PASS, "enterCountry" );
            selectByVisibleTextFromDropDown(country, text);
        }

        public void enterCity(String text) {
                CustomListeners.test.log(Status.PASS, "enterCity" );
            sendTextToElement(city, text);
        }
        public void enterAddress1(String text) {
                CustomListeners.test.log(Status.PASS, "enterAddress1" );
            sendTextToElement(address1, text);

        }
        public void enterZipPostalCode(String text) {
                CustomListeners.test.log(Status.PASS, "enterZipPostalCode" );
            sendTextToElement(zipPostalCode, text);

        }
        public void enterPhoneNumber(String text) {
                CustomListeners.test.log(Status.PASS, "enterPhoneNumber" );
            sendTextToElement(phoneNumber, text);

        }
        public void continue3(){

                CustomListeners.test.log(Status.PASS, "continue3" );
            clickOnElement(continueButton3);
        }
        public void setRadiobutton1(){
                CustomListeners.test.log(Status.PASS, "setRadiobutton1" );
            clickOnElement(radiobutton1);
        }
        public void continue4(){
                CustomListeners.test.log(Status.PASS, "continue4" );
            clickOnElement(continueButton4);
        }
        public void setRadiobutton2(){
                CustomListeners.test.log(Status.PASS, "setRadiobutton2" );
            clickOnElement(radiobutton2);
        }
        public void paymentMethodButton(){
                CustomListeners.test.log(Status.PASS, "paymentMethodButton" );
            clickOnElement(paymentMethod);
        }
        public void selectCreditCard(String text){
                CustomListeners.test.log(Status.PASS, "selectCreditCard" );
            selectByVisibleTextFromDropDown(selectVisa,text);
        }
        public void selectCardHolderName(String text){
                CustomListeners.test.log(Status.PASS, "selectCardHolderName" );
            sendTextToElement(cardHolderName,text);
        }
        public void enterCardNumber(String text){
                CustomListeners.test.log(Status.PASS, "enterCardNumber" );
            sendTextToElement(cardNumber,text);
        }
        public void selecttExpireMonth(String text){
                CustomListeners.test.log(Status.PASS, "continue3" );
            selectByVisibleTextFromDropDown(selectExpireMonth,text);
        }
        public void selecttExpireYear(String text){
                CustomListeners.test.log(Status.PASS, "continue3" );
            selectByVisibleTextFromDropDown(selectExpireYear,text);
        }
        public void enterCardCode(String text){
                CustomListeners.test.log(Status.PASS, "continue3" );
            sendTextToElement(cardCode,text);
        }
        public void clickOnCheckOut(){
                CustomListeners.test.log(Status.PASS, "continue3" );
            clickOnElement(continueCheckOut);
        }
        public String verifyMessage1() {
                CustomListeners.test.log(Status.PASS, "continue3" );
            return getTextFromElement(verifyMessage1);
        }
        public String verifyMessage2() {
                CustomListeners.test.log(Status.PASS, "continue3" );
            return getTextFromElement(verifyMessage2);
        }
        public String verifyMessage3() {
                CustomListeners.test.log(Status.PASS, "continue3" );
            return getTextFromElement(verifyMessage3);
        }
        public void clickOnConfirm(){
                CustomListeners.test.log(Status.PASS, "continue3" );
            clickOnElement(clickConfirm);
        }
        public String verifyMessage4() {
                CustomListeners.test.log(Status.PASS, "continue3" );
            return getTextFromElement(verifyMessage4);
        }
        public String verifyMessage5() {
                CustomListeners.test.log(Status.PASS, "continue3" );
            return getTextFromElement(verifyMessage5);
        }
        public void clickOnContinue(){
                CustomListeners.test.log(Status.PASS, "continue3" );
            clickOnElement(clickContinuee);
        }
        public String verifyMessage6() {
                CustomListeners.test.log(Status.PASS, "continue3" );
            return getTextFromElement(verifyMessage6);
        }
        public void clickOnLogOut(){
                CustomListeners.test.log(Status.PASS, "continue3" );
            clickOnElement(clickonLogout);
        }
        public void changeQuantityTo2() {
                CustomListeners.test.log(Status.PASS, "continue3" );
                clearAndEnterQuantity(productQuantity, "2");

        }
        By productQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
        public void clickCheckOutTab() {
                CustomListeners.test.log(Status.PASS, "continue3" );
                clickOnElement(checkoutTab);    }
        By checkoutTab= By.id("checkout");
    }

