package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SaoPauloPage extends BasePage {

	public SaoPauloPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public SaoPauloPage searchContent() {
		driver.findElement(By.id("searchtext")).sendKeys("Playstation 4");
		driver.findElement(By.id("searchbutton")).click();
	    return this;
	}

}
