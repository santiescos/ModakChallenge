package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	private final By elementWithInfoFromAvailability = By.cssSelector("div[class='quantity--info--jnoo_pD'] div span");
	WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean verifyAvailabilityFromElement() {
		String stringFromElement = driver.findElement(elementWithInfoFromAvailability).getText();
		String[] parts = stringFromElement.split(" ");
        int availableProducts = Integer.parseInt(parts[0]);
        return availableProducts !=0;
	}
		
}
