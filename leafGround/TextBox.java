package leafGround;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.leafground.com/input.xhtml");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']")).sendKeys("Yazhini");
	 driver.findElement(By.name("j_idt88:j_idt91")).sendKeys("India");
	 boolean textBox = driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
	
	     if(!textBox) {
	    	 System.out.println("Textbox is disabled");
	     } else {
	    	 System.out.println("Textbox is enabled");
	     }
      driver.findElement(By.name("j_idt88:j_idt95")).clear();
      driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("My learning is superb so far.");
      driver.findElement(By.name("j_idt88:j_idt99")).sendKeys("yazhini213@gmail.com",Keys.TAB);
      driver.findElement(By.name("j_idt88:j_idt101")).sendKeys("I am software tester");
      driver.findElement(By.className("ql-underline")).click();
      driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Software testing");
      driver.findElement(By.name("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
     
      String age = driver.findElement(By.xpath("//span[text()='Age is mandatory']")).getText();
         System.out.println(age);
      Point before = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
     	  
      driver.findElement(By.xpath("//input[@name='j_idt106:float-input']")).click();
      Point after = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
      if (before.equals(after)) {
    	  System.out.println("Username is not changed");
      }else {
    	  System.out.println("Username is changed");
      }
      
      driver.findElement(By.name("j_idt106:auto-complete_input")).sendKeys("Yazhini");
      driver.findElement(By.xpath("//li[text()='2']")).click();
      
      String dob = "05/03/1995";
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@class='ui-inputfield ui-widget ui-state-default ui-corner-all']")).sendKeys(dob);
      
      String text = driver.findElement(By.xpath("//a[text()='3']")).getText();
      if(dob.contains(text)) {
    	  System.out.println("DOB has conformed");
    	  
      } else {
    	  System.out.println("DOB not conformed");
      }
      
      WebElement value = driver.findElement(By.xpath("//input[@class='ui-spinner-input ui-inputfield ui-state-default ui-corner-all']"));
      value.sendKeys("7");
      driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-s']")).click();
      Thread.sleep(2000);
      String spin = driver.findElement(By.xpath("//input[@name='j_idt106:j_idt118_input']")).getAttribute("aria-valuenow");
      if(spin.equals("7")) {
    	  System.out.println("Values are not changed");
      } else {
    	  System.out.println("Values are changed");
      }

       
      Point bf = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")).getLocation();
      WebElement number = driver.findElement(By.xpath("//input[@name='j_idt106:slider']"));
      number.sendKeys("50");
	  Point af = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")).getLocation();
		
		if(bf.equals(af)) {
			System.out.println("Location has not changed");
		} else {
			System.out.println(" Location has changed");
		}
		
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad']")).click();
		boolean displayed = driver.findElement(By.xpath("//button[text()='Enter']")).isDisplayed();
		
		if(displayed) {
			System.out.println("Keyboard is displayed");
		} else {
			System.out.println("Keyboard is NOT displayed");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ql-picker-label'])[7]")).click();
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[2]")).sendKeys("Software tester");
		
		
	}

}
