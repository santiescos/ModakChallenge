package pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
	
	public void changeToProductWindow() {
		Set <String> allWindows = driver.getWindowHandles();
		Iterator <String> iterator = allWindows.iterator();
		String searchWindow = iterator.next();
		String productWindow = iterator.next();
		driver.switchTo().window(productWindow);
	}
}
