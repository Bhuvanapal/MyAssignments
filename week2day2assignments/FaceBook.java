package week2day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Bhuvaneshwari");
		driver.findElement(By.name("lastname")).sendKeys("Palani");
		driver.findElement(By.name("reg_email__")).sendKeys("7397269041");
		driver.findElement(By.name("reg_passwd__")).sendKeys("bd_21102011");
		
		
		WebElement drop1 = driver.findElement(By.name("birthday_day"));
		Select day = new Select(drop1);
		day.selectByIndex(6);
		
		WebElement drop2 = driver.findElement(By.name("birthday_month"));
		Select month = new Select(drop2);
		month.selectByVisibleText("Sep");
		
		WebElement drop3 = driver.findElement(By.name("birthday_year"));
		Select year = new Select(drop3);
		year.selectByValue("2011");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
		
		

	}

}
