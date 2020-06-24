package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.UUID;

public class OtpProdTest {

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\victoria.be\\Downloads\\chromedriver_win32\\chromedriver.exe");
    }

    @Test
//    OTP brand 10.3-demo LP prod
    void test1() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://cdn.otprofits.com/en/10.3-demo");

        final WebElement ctabutton = driver.findElementByXPath("/html/body/div/div/div[1]/div/div/div/a");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", ctabutton);

        final WebElement firstname = driver.findElementByXPath("/html/body/div/div/div[10]/div/div/form/div[1]/input");
        firstname.sendKeys("test");

        final WebElement lastname = driver.findElementByXPath("/html/body/div/div/div[10]/div/div/form/div[2]/input");
        lastname.sendKeys("test");

        final WebElement phone = driver.findElementByXPath("/html/body/div/div/div[10]/div/div/form/div[3]/div/input");
        phone.sendKeys("660456765");

        final WebElement email = driver.findElementByXPath("/html/body/div/div/div[10]/div/div/form/div[4]/input");
        email.sendKeys(UUID.randomUUID().toString().substring(0, 14).replace("-", "") + "@mailinator.com");

        final WebElement secondcheckbox = driver.findElementByXPath("/html/body/div/div/div[10]/div/div/form/div[8]/div/label");
        executor.executeScript("arguments[0].click();", secondcheckbox);

        Thread.sleep(2000);

        final WebElement startnow = driver.findElementByXPath("/html/body/div/div/div[10]/div/div/form/div[6]/button/span[1]");
        executor.executeScript("arguments[0].click();", startnow);

        driver.quit();

    }

        @Test
        //OTP brand arab LP prod
        void test2() throws InterruptedException {
            ChromeDriver driver;
            driver = new ChromeDriver();

            driver.get("https://cdn.otprofits.com/en/arab");

            final WebElement ctabutton = driver.findElementByXPath("/html/body/div/div/section/div/div[1]/button");
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", ctabutton);

            final WebElement firstname = driver.findElementByXPath("/html/body/div/div/div[3]/div/div/form/div[1]/input");
            firstname.sendKeys("test");

            final WebElement lastname = driver.findElementByXPath("/html/body/div/div/div[3]/div/div/form/div[2]/input");
            lastname.sendKeys("test");

            final WebElement phone = driver.findElementByXPath("/html/body/div/div/div[3]/div/div/form/div[3]/div/input");
            phone.sendKeys("660456765");

            final WebElement email = driver.findElementByXPath("/html/body/div/div/div[3]/div/div/form/div[4]/input");
            email.sendKeys(UUID.randomUUID().toString().substring(0,14).replace("-", "") + "@mailinator.com");

            final WebElement secondcheckbox = driver.findElementByXPath("/html/body/div/div/div[3]/div/div/form/div[8]/div/label");
            executor.executeScript("arguments[0].click();", secondcheckbox);

            Thread.sleep(2000);

            final WebElement startnow = driver.findElementByXPath("/html/body/div/div/div[3]/div/div/form/div[6]/button");
            executor.executeScript("arguments[0].click();", startnow);

            driver.quit();
    }
    @Test
        //OTP brand bitcoin LP prod
    void test3() throws InterruptedException {
        ChromeDriver driver;
        driver = new ChromeDriver();

        driver.get("https://cdn.otprofits.com/en/bitcoin");

        final WebElement ctabutton = driver.findElementByXPath("/html/body/div/div[1]/section[1]/div/div/button[1]");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", ctabutton);

        final WebElement firstname = driver.findElementByXPath("/html/body/div/div[4]/div/div/form/div[1]/input");
        firstname.sendKeys("test");

        final WebElement lastname = driver.findElementByXPath("/html/body/div/div[4]/div/div/form/div[2]/input");
        lastname.sendKeys("test");

        final WebElement phone = driver.findElementByXPath("/html/body/div/div[4]/div/div/form/div[3]/div/input");
        phone.sendKeys("660456765");

        final WebElement email = driver.findElementByXPath("/html/body/div/div[4]/div/div/form/div[4]/input");
        email.sendKeys(UUID.randomUUID().toString().substring(0,14).replace("-", "") + "@mailinator.com");

        final WebElement secondcheckbox = driver.findElementByXPath("/html/body/div/div[4]/div/div/form/div[8]/div/label");
        executor.executeScript("arguments[0].click();", secondcheckbox);

        Thread.sleep(2000);

        final WebElement startnow = driver.findElementByXPath("/html/body/div/div[4]/div/div/form/div[6]/button");
        executor.executeScript("arguments[0].click();", startnow);

        driver.quit();
    }
    @Test
        //OTP brand lead-generation LP prod
    void test4() throws InterruptedException {
        ChromeDriver driver;
        driver = new ChromeDriver();

        driver.get("https://cdn.otprofits.com/en/lead-generation");

        final WebElement firstname = driver.findElementByXPath("/html/body/div/div/div/div[1]/form/div[1]/input");
        firstname.sendKeys("test");

        final WebElement lastname = driver.findElementByXPath("/html/body/div/div/div/div[1]/form/div[2]/input");
        lastname.sendKeys("test");

        final WebElement phone = driver.findElementByXPath("/html/body/div/div/div/div[1]/form/div[3]/div/input");
        phone.sendKeys("660456765");

        final WebElement email = driver.findElementByXPath("/html/body/div/div/div/div[1]/form/div[4]/input");
        email.sendKeys(UUID.randomUUID().toString().substring(0,14).replace("-", "") + "@mailinator.com");

        final WebElement secondcheckbox = driver.findElementByXPath("/html/body/div/div/div/div[1]/form/div[8]/div/label");
        driver.executeScript("arguments[0].click();", secondcheckbox);

        Thread.sleep(2000);

        final WebElement startnow = driver.findElementByXPath("/html/body/div/div/div/div[1]/form/div[6]/button");
        driver.executeScript("arguments[0].click();", startnow);

        driver.quit();
    }
}
