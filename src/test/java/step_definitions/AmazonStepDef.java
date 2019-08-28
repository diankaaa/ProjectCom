package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPages;
import pages.GooglePage;
import utilities.Pages;

public class AmazonStepDef {


    AmazonPages ams = new AmazonPages();
    GooglePage gp = new GooglePage();

    Pages pages = new Pages();


    @When("User press all in amazon search box")
    public void user_press_all_in_amazon_search_box() throws InterruptedException {
     ams.searchBox.sendKeys("shoes", Keys.ENTER);
     Thread.sleep(2000);


    }

    @Then("User should be able to select second option")
    public void user_should_be_able_to_select_second_option() throws InterruptedException {
        ams.list.click();
        Select select = new Select(ams.list);
        select.selectByIndex(1);
        Thread.sleep(2000);
        ams.searchButton.click();
    }




}
