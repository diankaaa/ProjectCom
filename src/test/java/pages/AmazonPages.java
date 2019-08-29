package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AmazonPages {


    public AmazonPages() {
        PageFactory.initElements(Driver.getDriver(),this);
}
  @FindBy(xpath = "//input[@type='text']")
    public WebElement searchBox;


  @FindBy(xpath = "//select[@aria-describedby='searchDropdownDescription']")
    public WebElement list;

  @FindBy(xpath = "//input[@type='submit']")
    public WebElement searchButton;






}
