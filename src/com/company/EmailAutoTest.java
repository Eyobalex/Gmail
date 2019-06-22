package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailAutoTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://selenium drivers//chrome//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url=("https://accounts.google.com/signin");
        driver.get(url);

        Thread.sleep(500);
        driver.navigate().refresh();

        Thread.sleep(500);
        driver.navigate().refresh();

        WebElement email = driver.findElement(By.id("identifierId"));
        email.sendKeys("lmswpf@gmail.com");

        WebElement nextE = driver.findElement(By.id("identifierNext"));
        nextE.click();

        Thread.sleep(1500);


        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("lms@wpf123");

        WebElement nextP = driver.findElement(By.id("passwordNext"));
        nextP.click();


        Thread.sleep(500);
        driver.navigate().refresh();Thread.sleep(500);
        driver.navigate().refresh();Thread.sleep(500);
        driver.navigate().refresh();Thread.sleep(500);
        driver.navigate().refresh();

        driver.get("https://mail.google.com/mail/u/0/#inbox");
        Thread.sleep(500);
        driver.navigate().refresh();
        Thread.sleep(500);


        WebElement unreadEmails = driver.findElement(By.className("bsU"));

        System.out.println("you have "+unreadEmails.getText() + " unread emails.");

        driver.close();


    }
}
