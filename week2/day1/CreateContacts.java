package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContacts {

	public static void main(String[] args) {
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("BHUVANESHWARI");
		driver.findElement(By.id("lastNameField")).sendKeys("PALANI");
		driver.findElement(By.name("submitButton")).click();
		
		
		
		String firstName= driver.findElement(By.id("viewContact_firstName_sp")).getText();

		System.out.println("First name is "+firstName);
		
		String sectionTitle = driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
			
		System.out.println(sectionTitle);
		
		driver.close();
	}

}
