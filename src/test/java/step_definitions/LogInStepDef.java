package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class LogInStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
       loginPage.user.isDisplayed();
       waitt();

    }

    @When("user logs in")
    public void user_logs_in() {
        loginPage.LogIn.click();
        waitt();
    }

    @Then("user click on the Log in as a User button")
    public void user_click_on_the_Log_in_as_a_User_button() {
        loginPage.LogInAsAUser.click();
        waitt();

    }

    @Then("user clicks on the Log in as a Product owner button")
    public void user_clicks_on_the_Log_in_as_a_Product_owner_button() {
        loginPage.LogInAsPO.click();
        waitt();

    }

    @Then("user PO page is displayed on the left side")
    public void user_PO_page_is_displayed_on_the_left_side() {
        loginPage.user.isDisplayed();
        waitt();
        Assert.assertEquals(loginPage.user.getText(),"PO page 1");
    }

    @Then("user Gov Staff page is displayed on the left side")
    public void user_Gov_Staff_page_is_displayed_on_the_left_side() {
        loginPage.user.isDisplayed();
        waitt();
        Assert.assertEquals(loginPage.user.getText(),"Gov Staff page 1");
    }

    @Then("user clicks on Log out button")
    public void user_clicks_on_Log_out_button() {
       loginPage.LogOut.click();
       waitt();
    }

    @Then("user going to the main page and sees the text home-component works!")
    public void user_going_to_the_main_page_and_sees_the_text_home_component_works() {
        loginPage.user.isDisplayed();
        waitt();
    }
    @Then("User page is displayed on the left side")
    public void user_page_is_displayed_on_the_left_side() {
        loginPage.user.isDisplayed();
        waitt();
        Assert.assertEquals(loginPage.user.getText(),"User page 1");
    }

    @Then("user clicks on the Log in as Government staff Admin as a button")
    public void user_clicks_on_the_Log_in_as_Government_staff_Admin_as_a_button()  {
       waitt();
        loginPage.LogInAsAdmin.click();
    }


    void waitt(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}