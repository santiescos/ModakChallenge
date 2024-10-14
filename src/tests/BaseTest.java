package tests;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	WebDriver driver;
    protected final String landingURL = "https://es.aliexpress.com/?gatewayAdapt=glo2esp";
    protected LandingPage landingInPage;
    protected ProductPage productPage;
    protected ResultPage resultPage;
    
    @BeforeClass
    public void initialize() {
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	driver.manage().window().maximize();
    	accessLandingPage();
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
