package pageObjects;

import java.lang.reflect.Array;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultsPage {
	private final By products = By.cssSelector("div[class='list--gallery--C2f2tvm search-item-card-wrapper-gallery']");
	WebDriver driver;
	
	public ResultsPage(WebDriver driver) {
		this.driver = driver;
	}

	private List<WebElement> convertSelectorToArray() {
		return driver.findElements(products);
	}
	
	
	public void clickOnSecondProduct() {
		convertSelectorToArray().get(1).click();
	}
}
