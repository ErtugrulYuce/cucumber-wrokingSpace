package com.prestashop.step_definitions;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import com.prestashop.pages.HomePage;
import com.prestashop.pages.MyAccountPage;
import com.prestashop.pages.RegistrationPage;
import com.prestashop.pages.SigninPage;
import com.prestashop.utilities.BrowserUtils;
import com.prestashop.utilities.ConfigurationReader;
import com.prestashop.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GroupGStepDefs {
	HomePage homePage = new HomePage();

	@When("the user click the group button")
	public void the_user_click_the_group_button() {
		homePage.groupIcon.click();
	}

	@Then("group G icon should displaid")
	public void group_G_icon_should_displaid() {
		assertTrue(homePage.groupGIcon.isDisplayed());
	}

	@Then("the user click on group G icon")
	public void the_user_click_on_group_G_icon() {
		homePage.groupGIcon.click();
	}

	@Then("verify all team names")
	public void verify_all_team_names(List<String> teamName) {
		System.out.println(teamName);

		Boolean b = false;
		for (String eachTeam : teamName) {

			String xpaths = "//td[contains(@class,'fi-table__teamname teamname-nolink')]//span[contains(@class,'fi-t__nText')][contains(text(),'"
					+ eachTeam + "')]";

			b = Driver.getDriver().findElement(By.xpath(xpaths)).isDisplayed();
			assertTrue(b);

		}

	}

}
