package com.dashboard.stepDefination;

import com.dashboard.base.AbstractSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

public class DashboardPage extends AbstractSteps {

    @Given("^Launch the mwi website$")
    public void launch_the_mwi_website() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        applyImpwait();
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @Then("^i can see its correct page$")
    public void i_can_see_its_correct_page() throws Exception {
        System.out.println(driver.getTitle());
        assert driver.getTitle() == "MWI Animal Health U.K. | A Veterinary Solutions Provider";
    }

    @Then("^i click on login page$")
    public void i_click_on_login_page() throws Exception {
        driver.findElement(By.xpath("/html/body/atomic-search-interface/div/header/div/div/div[2]/div/div/div[2]/a/span[1]"));
    }

    @Then("^i verify the user has successfully login with the provided email$")
    public void i_verify_the_user_has_successfully_login_with_the_provided_email() throws Exception {

    }

    @Then("^i log out from the account$")
    public void i_log_out_from_the_account() throws Exception {

    }

}
