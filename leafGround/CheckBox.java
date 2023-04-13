package leafGround;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		boolean checkbox = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isEnabled();
		if (!checkbox) {
			System.out.println("Checkbox is enabled");
		}else {
			System.out.println("Checkbox is disabled");
		}
		driver.findElement(By.xpath("//div[@aria-haspopup='listbox']")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		
		
		
		
		
		
		
		
	}

}
