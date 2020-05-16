package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class homePage {
    public String PAGE_URL;




    //Elements
    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'http://classicglassetching.com')]/@href")
    protected WebElement homeLink;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Weddings')]")
    protected List<WebElement> weddingLink;

    //Constructor
    public homePage(WebDriver driver, String url){
        this.PAGE_URL = url;
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    //Methods
    public void clickWeddings(){
        weddingLink.get(2).click();
    }
}