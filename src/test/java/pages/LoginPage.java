package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//div[@class='mat-list-item-content'])[2]")
    public WebElement LogIn;

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[1]")
    public WebElement LogInAsAUser;


    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[2]")
    public WebElement LogInAsPO;

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[3]")
    public WebElement LogInAsAdmin;

    @FindBy(xpath = "(//div[@class='mat-list-item-content'])[3]")
    public WebElement LogOut;

    @FindBy(xpath = "(//div[@class='mat-list-item-content'])[2]")
    public WebElement user;
}