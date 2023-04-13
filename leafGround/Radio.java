package leafGround;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
        
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//label[text()='Chrome']")).click();
        driver.findElement(By.xpath("//label[text()='Chennai']")).click();
        boolean selected = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isSelected();
        
        if(!selected) {
        	System.out.println("Safari is default radiobutton");
        }else {
        	System.out.println("Safari is not a default");
        }
        boolean age = driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
        
        if (!age) {
        	System.out.println("Age is default");
        }else {
        	System.out.println("Age is not a default");
        }
        
        
        
       
	}

}
