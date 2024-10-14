package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	private final String productToSearch = "instax mini";
	private final By searchBox = By.id("search-words");
	private final By iconToSubmitSearch = By.cssSelector("input[class='search--submit--2VTbd-T']");	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchProduct() {
		driver.findElement(searchBox).sendKeys(productToSearch);
		driver.findElement(iconToSubmitSearch).click();
	}
}
