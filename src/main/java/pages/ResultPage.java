package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPage extends BasePage {

	public ResultPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public ResultPage showProcucts() throws InterruptedException {
	Thread.sleep(7000);
	List<WebElement> elements = driver.findElements(By.xpath("//*[@class='sc-1fcmfeb-1 iptkoI']//a[contains(@data-lurker-detail,'list_id')]"));
    int contador = 0;
	for (WebElement elem : elements) {
      contador++;
      System.out.print("\n "+elem.findElement(By.xpath(".//h2")).getText());
      Boolean isPresent = elem.findElements(By.xpath(".//p[contains(@class,'fnmrjs-16 jqSHIm')]")).size() > 0;
      
      if (isPresent = true) {
      System.out.print(" - "+elem.findElement(By.xpath(".//p[contains(@class,'fnmrjs-16 jqSHIm')]")).getText());
      } else
    	  System.out.print(" ");
      if (contador == 5){
    	  break;
      } 
    }
    Thread.sleep(2000);
	return this;
	}
	
	public ResultPage clickButtonTwo() {
		
		//Using Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement secondPageButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-lurker_position='2']")));
		driver.findElement(By.xpath("//a[@data-lurker_position='2']")).click();

		return this;
	}

}
