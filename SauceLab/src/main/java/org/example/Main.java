package org.example;

public class Main {
    public static void main(String[] args)throws InterruptedException {
        driver.get( "https://www.saucedemo.com/v1/");
        Thread.sleep(millis 3000);
        WEbElement usernameInput= driver.findElement( By.cssSelector( "#username"));
        usernameIput.sendKeys( ...keysToSend:'blabla')
        System.out.println("Hello world!");
    }
}