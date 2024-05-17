package sal.di.pagefactory;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sal.di.pagefactory.pages.AddressPage;
import sal.di.pagefactory.pages.CartPage;
import sal.di.pagefactory.pages.CompletionPage;
import sal.di.pagefactory.pages.LoginPage;
import sal.di.pagefactory.pages.OrderPage;
import sal.di.pagefactory.pages.ProductsPage;

public class OrderItemSteps {
	//
	WebDriverFactory wdf;
	WebDriver driver;
	LoginPage loginPage;
	ProductsPage productpage;
	CartPage cartpage;
	AddressPage addresspage;
	OrderPage orderpage;
	CompletionPage completionpage;
	

	//
	public OrderItemSteps(WebDriverFactory wdf) {
		this.wdf = wdf;
		this.driver = wdf.driver;
		loginPage = new LoginPage(wdf);
		productpage = new ProductsPage(wdf);
		cartpage = new CartPage(wdf);
		addresspage = new AddressPage(wdf);
		orderpage = new OrderPage(wdf);
		completionpage = new CompletionPage(wdf);
	}

	@Given("navigated to loginpage")
	public void navigated_to_loginpage() {
	    //
		loginPage.navigateToLoginpage();
	}

	@Given("passing valid credentials")
	public void passing_valid_credentials() {
	    // 
		loginPage.loginWithValidCrendentials();
	}

	@When("add items to cart")
	public void add_items_to_cart() {
	    // 
		productpage.addItem();
	}

	@When("verify cart items")
	public void verify_cart_items() {
	    // 
		int cartCount = Integer.parseInt(productpage.getCartCount());
		System.out.println(cartCount);
		productpage.moveToCart();
		cartpage.checkooutCart();
		
	}

	@When("provide delivery details")
	public void provide_delivery_details() {
	    // 
		addresspage.enterAddressInformaiton();
		addresspage.continueToOrder();
	}

	@When("confirm order and payment")
	public void confirm_order_and_payment() {
	    // 
		orderpage.confirmOrder();
	}

	@Then("verify order confirmation")
	public void verify_order_confirmation() {
	    // 
		assertTrue(completionpage.getOrderStatus());
	}


}
