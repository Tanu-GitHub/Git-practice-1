package Resource;


	

	import java.io.File;
import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class BaseTest {
	    public WebDriver driver;
	    public Properties prop;

	    public WebDriver initializeDriver() throws IOException{
	        //Properties prop=new Properties();
	    	prop=new Properties();
	        FileInputStream fis=new FileInputStream("C:\\work\\eclipse-workspace\\eclipse-workspace\\Cucumber2\\src\\main\\java\\Resource\\configurationfile.properties");
	        prop.load(fis);
	        String browserName=prop.getProperty("browser");
	        System.out.println(browserName);


	        if(browserName.equals("chrome"))
	        {
	        	
	            //execute in chrome
	           // System.setProperty("webdriver.chrome.driver", "./ver/chromedriver.exe");
	            driver=new ChromeDriver();
	        }

	        else if(browserName.equals("firefox"))
	        {

	           // System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	            driver = new FirefoxDriver();

	        }

	        else if(browserName.equals("Edge"))
	        {
	            //System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	            driver = new EdgeDriver();


	        }

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	        driver.manage().window().maximize();
	       
	       // driver.get(prop.getProperty("url"));
	        return driver;
	    }
	       
	       
	






}



