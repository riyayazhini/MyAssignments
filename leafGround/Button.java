package leafGround;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		    System.out.println("The title of the page is " + title);
	    driver.get("https://www.leafground.com/button.xhtml");
	    boolean button = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
	    if (button) {
	    	System.out.println("Button is disabled");
	    } else {
	    	System.out.println("Button is enabled");
	    }
	    
	    Point submit = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
	    
	        System.out.println(submit);
	    
	    
	    
	    
	    
	    
	}

}
