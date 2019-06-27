package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage extends BasePage {

	public ResultPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public ResultPage showProcucts() throws InterruptedException {
	Thread.sleep(7000);
	List<WebElement> elements = driver.findElements(By.xpath("//*[@id='main-ad-list']//a[contains(@lurker,'list_id')]"));
    int contador = 0;
	for (WebElement elem : elements) {
      contador++;
      System.out.println(elem.findElement(By.xpath(".//h2")).getText());
      System.out.println(elem.findElement(By.xpath(".//p[contains(@class,'OLXad-list-price')]")).getText());
      if (contador == 5){
    	  break;
      } 
    }
    Thread.sleep(8000);
	return this;
	}
	
	public ResultPage clickButtonTwo() {
		driver.findElement(By.linkText("2")).click();
		return this;
	}

}
