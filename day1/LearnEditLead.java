package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnEditLead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yazhini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Riya");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		WebElement des = driver.findElement(By.id("createLeadForm_description"));

		des.sendKeys("I am Software tester");
		
		WebElement em = driver.findElement(By.id("createLeadForm_primaryEmail"));
		em.sendKeys("yazhini213@gmail.com");
		WebElement source = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select dd = new Select (source);

		dd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();

		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
	
		WebElement des1 = driver.findElement(By.id("updateLeadForm_description"));
		des1.clear();
		driver.findElement(By.name("importantNote")).sendKeys("I am Non IT Student");
		String title1 = driver.getTitle();
		System.out.println("The title is " + title1);
		driver.close();
	 }

}
