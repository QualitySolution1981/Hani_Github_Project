package HaniPCKG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Slider {
	public WebDriver driver;
  
	@BeforeTest
	  public void beforeTest() throws InterruptedException {
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
	       Actions move = new Actions(driver);
	        WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
	        move.dragAndDropBy(slider, 80, 0).perform();
		
		
	  }
	
	@Test
  public void f() {
		
	 //need to switch to this frame before clicking the slider
       
 
  }
  

  @AfterTest
  public void afterTest() {
  }

}
