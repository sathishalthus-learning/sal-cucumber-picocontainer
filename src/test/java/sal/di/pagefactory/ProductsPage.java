package sal.di.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ProductsPage {
	//
	WebDriver driver;

	//
	public ProductsPage(WebDriverFactory wdf) {
		//
		PageFactory.initElements(wdf.driver, this);
		this.driver = wdf.driver;
	}

	By firstItem = RelativeLocator.with(By.xpath("//button[text()='ADD TO CART']")).below(By.xpath("//div[text()='Sauce Labs Backpack']"));

	//
	@FindBy(css = ".shopping_cart_badge")
	private WebElement cartBadge;
	
	@FindBy(css = ".shopping_cart_container")
	private WebElement cartIcon;
	
	public void addItem() {
		firstItem.findElement(driver).click();
	}
	
	public String getCartCount() {
		return cartBadge.getText();
	}
	
	public void moveToCart() {
		cartIcon.click();
		
	}

}
