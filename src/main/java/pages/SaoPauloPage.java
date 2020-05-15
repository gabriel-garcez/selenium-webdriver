package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SaoPauloPage extends BasePage {

	public SaoPauloPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public SaoPauloPage searchContent() throws InterruptedException {
		
		//Using Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("Playstation 4");
		
		
		driver.findElement(By.xpath("//button[@class='submitBtn']")).click();
	    return this;
	}

}
