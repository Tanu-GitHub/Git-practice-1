package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	
	}
	By search=By.xpath("//input[@type='search']");
	By productName=By.cssSelector("h4.product-name");
	By topDeals=By.linkText("Top Deals");
	
	//testcontextsetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
	//landingpageproductname=testcontextsetup.driver.findElement(By.cssSelector("h4.product-name"))
	//testcontextsetup.driver.findElement(By.linkText("Top Deals")).click();
	
	public void searchItems(String name) {
		driver.findElement(search).sendKeys(name);
		System.out.println("searchlandingpageobject1");
		}
	public void getSearchText() {
		driver.findElement(search).getText();
		System.out.println("landingpageSearchedproduct2");
	}
    public String getProductName() {

		System.out.println("landingpageproductName3");
		return driver.findElement(productName).getText().split("-")[0].trim();
		
}
    public void selectTopDealsPage() {

		System.out.println("landingpageTopdealsName4");
		driver.findElement(topDeals).click();
}
    }