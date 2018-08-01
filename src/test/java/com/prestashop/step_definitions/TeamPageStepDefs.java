package com.prestashop.step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import com.prestashop.pages.HomePage;
import com.prestashop.pages.SigninPage;
import com.prestashop.utilities.ConfigurationReader;
import com.prestashop.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TeamPageStepDefs {
	HomePage hp = new HomePage();

	@Given("the user is on the {string}")
	public void the_user_is_on_the(String page) {
		page = ConfigurationReader.getProperty("url");
		Driver.getDriver().get(page);

	}

	@Then("verify the title is {string}")
	public void verify_the_title_is(String title) {

		title = Driver.getDriver().getTitle();
		title = title.replaceAll(" ", "");
		String expectedTitle = "2018 FIFA World Cup Russia™ - FIFA.com";
		expectedTitle = expectedTitle.replaceAll(" ", "");
		assertEquals(expectedTitle, title);
	}

	@When("the user click the team botton")
	public void the_user_click_the_team_botton() {
		hp.teamMain.click();
	}

	@Then("the user should see {int} teams  on the screen")
	public void the_user_should_see_teams_on_the_screen(Integer tnum) {
		Integer atnum = hp.allTeam.size();
		tnum = 32;
		assertEquals(tnum, atnum);
	}

}
