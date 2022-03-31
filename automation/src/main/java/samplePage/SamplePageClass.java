package samplePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamplePageClass {

    public void launchDriver(){
        System.setProperty("chromeDriver.exe","");
        WebDriver driver = new ChromeDriver();
        driver.navigate();
    }
}
