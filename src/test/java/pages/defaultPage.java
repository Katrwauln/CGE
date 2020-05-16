package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class defaultPage extends homePage{
    public defaultPage(WebDriver driver){
        super(driver, "http://classicglassetching.com/");
    }

    @FindBy(how = How.CSS, using = "h2")
    protected WebElement titleText;

    public void printTitleText(){
        System.out.println(titleText.getText());
    }
}