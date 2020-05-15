package support;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screenshot {
	
	public static void take(WebDriver driver, String file) throws IOException {


		    WebElement ele = driver.findElement(By.xpath("//*[@class='sc-1fcmfeb-2 ggOGTJ']"));   
		    File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    BufferedImage  fullImg = ImageIO.read(screenshot);
		    Point point = ele.getLocation();
		    int eleWidth = ele.getSize().getWidth();
		    int eleHeight = ele.getSize().getHeight();
		    BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
		    ImageIO.write(eleScreenshot, "png", screenshot);
		    FileUtils.copyFile(screenshot, new File(file));
		}
}

