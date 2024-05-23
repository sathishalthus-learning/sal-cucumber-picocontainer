package sal.di.framework;

public class Framework {

	//
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	
	public Framework() {
		// TODO Auto-generated constructor stub
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.driver);
	}
	
	public WebDriverManager getDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
}
