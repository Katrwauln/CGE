package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.defaultPage;

public class numeroUno {
    WebDriver driver;


    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void cleanup(){
        driver.close();
    }

    @Test
    public void clickWedding(){
        defaultPage home = new defaultPage(driver);
        home.printTitleText();
        home.clickWeddings();
    }

}
