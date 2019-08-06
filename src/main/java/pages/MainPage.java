package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
	
	
	public MainPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public MainPage clickState() {
		driver.findElement(By.linkText("SP")).click();
		 return this;
		}
	
}
