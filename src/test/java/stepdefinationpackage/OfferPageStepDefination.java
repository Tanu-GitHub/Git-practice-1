package stepdefinationpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import Resource.BaseTest;
import Utils.TextContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;



public class OfferPageStepDefination extends BaseTest{
	
	public String offerpageproductname;
	 TextContextSetup testcontextsetup;
	 public String landingpageproductname;
	 PageObjectManager pageobjectmanager;
	
	 public OfferPageStepDefination(TextContextSetup testcontextsetup) {
		 this.testcontextsetup=testcontextsetup;
	}
	@Then("User searched for same {string} shrotname in offers page")
	public void user_searched_for_same_shrotname_in_offers_page(String shortname) throws IOException, InterruptedException{
		
		switchToOfferpage();
		OfferPage offerpage=new OfferPage(testcontextsetup.driver);
		offerpage.searchItems(shortname);
		
	//	testcontextsetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
		Thread.sleep(4000);
		//offerpageproductname = testcontextsetup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
		offerpageproductname =offerpage.getProductName();
		
		System.out.println(offerpageproductname);
	}
	public void switchToOfferpage() {
	
	//testcontextsetup.driver.findElement(By.linkText("Top Deals")).click();
		//LandingPage landingpage=new LandingPage(testcontextsetup.driver);
		pageobjectmanager=new PageObjectManager(testcontextsetup.driver);
		LandingPage landingpage=pageobjectmanager.getLandingPage();
		
		landingpage.selectTopDealsPage();
		Set<String> s1=testcontextsetup.driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		String parentwindow= i1.next();
		String childwindow= i1.next();
		testcontextsetup.driver.switchTo().window(childwindow);
	}
	
	
	
	@Then("Validate product name in offer page and matches with landing page")
	public void validate_product_name_in_offer_page_and_matches_with_landing_page() throws InterruptedException {
		Thread.sleep(4000);
	    Assert.assertEquals(landingpageproductname, testcontextsetup.offerpageproductname);
	}




}
