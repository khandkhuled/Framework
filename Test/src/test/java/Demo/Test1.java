package Demo;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		 driver=new ChromeDriver();
		 driver.get("http://172.16.15.49:8002/candidate/otr");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		
		 WebElement Name=driver.findElement(By.xpath("//input[@id='candidate_name']"));
		String AA="asqwertyuiopasdfghjklzxcvbnm";
		 Name.sendKeys(RandomStringUtils.random(5, AA));
		 
		 WebElement FName=driver.findElement(By.xpath("//input[@id='father_name']"));
		 FName.sendKeys(RandomStringUtils.random(5, AA));
		 
		 WebElement MName=driver.findElement(By.xpath("//input[@id='mother_name']"));
		 MName.sendKeys(RandomStringUtils.random(5, AA));
		 
//		 WebElement GenderDropdown=driver.findElement(By.xpath("//div[@id='react-select-5-placeholder']"));
//		 GenderDropdown.click();
//		 driver.findElement(By.xpath(AA));
//		 Select Gender=new Select (GenderDropdown);
//		 Gender.selectByVisibleText("Male");
		 
	
		 WebElement Xrollno=driver.findElement(By.xpath("//input[@id='class_x_roll_no']"));
		 Xrollno.sendKeys(RandomStringUtils.random(5, AA));
		 
		
//		 WebElement DOB=driver.findElement(By.xpath("//input[@id=':rh:']"));
//		 DOB.sendKeys("02/07/2005");
		 
				 
		 WebElement PlaceofBirth=driver.findElement(By.xpath("//input[@id='place_of_birth']"));
		 PlaceofBirth.sendKeys(RandomStringUtils.random(5, AA));
		
		 WebElement Email=driver.findElement(By.xpath("//input[@id='E-mail Address']"));
		 Email.sendKeys(RandomStringUtils.random(5, AA)+"@gmail.com");
//		 Thread.sleep(1000);
//		 WebElement SendOTP=driver.findElement(By.xpath("//button[@class='input-sm btn btn-warning']"));
//		 SendOTP.click();
		
		 
				Random r = new Random();
				int rand = r.nextInt(100000000,999999999);
		 
		 WebElement Mobile=driver.findElement(By.xpath("//input[@id='Mobile Number']"));
		 Mobile.sendKeys("9"+rand);
		 
		 WebElement SQ1=driver.findElement(By.xpath("//input[@id='securityanswer1']"));
		 SQ1.sendKeys(RandomStringUtils.random(5, AA));
		 
		 WebElement SQ2=driver.findElement(By.xpath("//input[@id='securityanswer2']"));
		 SQ2.sendKeys(RandomStringUtils.random(5, AA));
		 
		 WebElement Password=driver.findElement(By.xpath("//input[@id='Password']"));
		 Password.sendKeys("P");
		 Password.sendKeys("a");
		 Password.sendKeys("s");
		 Password.sendKeys("s");
		 Password.sendKeys("w");
		 Password.sendKeys("o");
		 Password.sendKeys("r");
		 Password.sendKeys("@");
		 Password.sendKeys("1");
		 Password.sendKeys("2");
		 Password.sendKeys("3");
		 WebElement ConfirmPassword=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		 ConfirmPassword.sendKeys("P");
		 ConfirmPassword.sendKeys("a");
		 ConfirmPassword.sendKeys("s");
		 ConfirmPassword.sendKeys("s");
		 ConfirmPassword.sendKeys("w");
		 ConfirmPassword.sendKeys("o");
		 ConfirmPassword.sendKeys("r");
		 ConfirmPassword.sendKeys("@");
		 ConfirmPassword.sendKeys("1");
		 ConfirmPassword.sendKeys("2");
		 ConfirmPassword.sendKeys("3");
		 
		 
	 	 
	}
	

}

