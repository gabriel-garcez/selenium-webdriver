package tests;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.ResultPage;
import pages.SaoPauloPage;
import support.NameGenerator;
import support.Screenshot;

public class Challenge2 {
	
		private WebDriver driver;
		
		
		@Before
		public void setUp() {
			driver = support.WebDriverManager.openBrowser();
		}
		
		@Test
		public void ExecutaDesafio() throws InterruptedException, IOException {
			new MainPage(driver).clickState();
			new SaoPauloPage(driver).searchContent();
			new ResultPage(driver).clickButtonTwo();
			Thread.sleep(5000);
		    Screenshot.take(driver, "C:\\Users\\Gabriel Garcez\\Desktop\\Knowledge\\prints\\"+NameGenerator.CreateName()+".png");				
		}
		
		@After
		public void tearDown() {
		driver.quit();
		}
		
}
