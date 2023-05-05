package week2day2assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//div[@style = 'padding-left:155px']/input)[2]")).sendKeys("Bhuvaneshwari");
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("//a[text()='10307']")).click();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Leaftest");
		driver.findElement(By.name("submitButton")).click();
		
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		System.out.println(text);
		
		if (text.contains("Leaf")) {
			System.out.println("Changed name appears");
		}
		else {
			System.out.println("Changed name does not appear");
			
		}
		
		
		
		
		

	}

}
