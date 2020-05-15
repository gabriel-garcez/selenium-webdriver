package tests;

import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.ResultPage;
import pages.SaoPauloPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Challenge1 {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		driver = support.WebDriverManager.openBrowser();
	}
	
	@Test
	public void executeChallenge() throws InterruptedException {
		new MainPage(driver).clickState();
		new SaoPauloPage(driver).searchContent();
		new ResultPage(driver).showProcucts();
	}
	
	@After
	public void tearDown() {
	driver.quit();
	}

}
