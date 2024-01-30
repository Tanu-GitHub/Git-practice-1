package stepdefinationpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import Resource.BaseTest;
import Utils.TextContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;



public class LandingPageStepDefination extends BaseTest{

	public String landingpageproductname;
	public String offerpageproductname;
	TextContextSetup testcontextsetup;
	
	
	public LandingPageStepDefination(TextContextSetup testcontextsetup) {
		 this.testcontextsetup=testcontextsetup;
		
	}
	
	@Given("User is an greencart landing page")
	public void user_is_an_greencart_landing_page() throws IOException, InterruptedException{
		testcontextsetup.driver =initializeDriver();
		Thread.sleep(4000);
		testcontextsetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		System.out.println("Open URL");
	}
	@When("User searched with shortname {string} and extracted with original product")
	public void user_searched_with_short_name_and_extracted_with_original_product(String shortname) throws IOException, InterruptedException{
		
	
		LandingPage landingPage=new LandingPage(testcontextsetup.driver);
		//LandingPage landingPage=testcontextsetup.pageobjectmanager.getLandingPage();
		landingPage.searchItems(shortname);
		//testcontextsetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
		Thread.sleep(4000);
		landingpageproductname=landingPage.getProductName();
		System.out.println(landingpageproductname);
	}

	
}




