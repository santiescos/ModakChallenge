package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegrationTests extends BaseTest {
	
	@Test(description = "Verifying there are available products")
	public void verifyingAvailabilityForInstaxMini() {
		landingPage.searchProduct();
		resultsPage.clickOnSecondProduct();
		resultsPage.changeToProductWindow();
		Assert.assertTrue(productPage.verifyAvailabilityFromElement());
	}
}
