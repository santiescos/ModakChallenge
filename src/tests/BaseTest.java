package tests;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pageObjects.LandingPage;
import pageObjects.ProductPage;
import pageObjects.ResultsPage;

public class BaseTest {

	WebDriver driver;
    protected final String landingURL = "https://es.aliexpress.com/?gatewayAdapt=glo2esp";
    protected LandingPage landingPage;
    protected ProductPage productPage;
    protected ResultsPage resultsPage;
    
    @BeforeClass
    public void initialize() {
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	driver.manage().window().maximize();
    	accessLandingPage();
    	landingPage = new LandingPage(driver);
    	productPage = new ProductPage(driver);
    	resultsPage = new ResultsPage(driver);
    }
    
    @BeforeMethod
    public void accessLandingPage() {
    	driver.get(landingURL);
    }
    
    @AfterClass
    public void shutDriverDown() {
    	driver.quit();
    }
}
