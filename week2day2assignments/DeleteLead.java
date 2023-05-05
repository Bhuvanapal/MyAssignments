package week2day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteLead {

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
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
        driver.findElement(By.xpath("//input[@id='ext-gen266']")).sendKeys("***");
        driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("*******");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        
            
        
        //Capture leadID of the first resulting lead
        
        String leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
        System.out.println(leadId);
        
               
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();        
        driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
       
       
       
       WebElement findElement = driver.findElement(By.xpath("//div[text()='No records to display']"));
       String text = findElement.getText();
       System.out.println(text);
       
        
        
	}

}
