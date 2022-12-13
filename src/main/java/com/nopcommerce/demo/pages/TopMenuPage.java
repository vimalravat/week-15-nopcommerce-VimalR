package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.List;

public class TopMenuPage extends Utility {


     By allTopMenuList = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");

    public void selectMenu(String   menu) {
        List<WebElement> topMenuList = (List<WebElement>) allTopMenuList;

        try {
            Iterator var3 = topMenuList.iterator();

            while(var3.hasNext()) {
                WebElement element = (WebElement)var3.next();
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException var5) {
            topMenuList = driver.findElements(allTopMenuList);
        }


        }

    }




