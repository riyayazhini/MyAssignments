package leafGround;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundSelect {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement tool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		
		Select dd = new Select(tool);
		dd.selectByVisibleText("Selenium");
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//div[@class='ui-autocomplete ui-autocomplete-multiple']")).click();
		Thread.sleep(1000);
		
	
		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
		driver.findElement(By.xpath("(//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all'])[2]")).click();
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[text()='English']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all'])[4]")).click();
		driver.findElement(By.xpath("//li[text()='Two']")).click();
		
		
		
		
		
		
		
		
		
	}

}
