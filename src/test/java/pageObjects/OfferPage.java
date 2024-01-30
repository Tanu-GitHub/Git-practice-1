package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	public WebDriver driver;
	public  OfferPage (WebDriver driver) {
		this.driver=driver;
	}
		
		
		
	By search=By.xpath("//input[@type='search']");
	By productName=By.cssSelector("tr td:nth-child(1)");

	//testcontextsetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
	//offerpageproductname = testcontextsetup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
	
	public void searchItems(String name) {
		driver.findElement(search).sendKeys(name);
		System.out.println("searchofferpageobject1");
		}
		
	
	public void getSearchText() {
		driver.findElement(search).getText();
		System.out.println("offerpageSearchedproduct2");
	}
    public String getProductName() {

		System.out.println("offerpageproductName3");
		return driver.findElement(productName).getText();
		
}

		
	
	//System.out.println(offerpageproductname);


//testcontextsetup.driver.findElement(By.linkText("Top Deals")).click();

}

