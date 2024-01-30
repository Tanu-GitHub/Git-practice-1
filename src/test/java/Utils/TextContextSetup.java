package Utils;

import org.openqa.selenium.WebDriver;

import Resource.BaseTest;
import pageObjects.PageObjectManager;


public class TextContextSetup extends BaseTest{
	public WebDriver driver;
	public String landingpageproductname;
	public String offerpageproductname;
	public PageObjectManager pageobjectmanager;
	public TextContextSetup() {
		pageobjectmanager	=new PageObjectManager(driver);
	
	
}
}