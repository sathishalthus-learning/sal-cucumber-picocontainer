package sal.di.framework;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ProductsPage {
	//
	Framework fw;

	//
	public ProductsPage(Framework fw) {
		//
		this.fw = fw;
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
