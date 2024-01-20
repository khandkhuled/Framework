package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		 driver=new ChromeDriver();
		 driver.get("http://10.246.21.141/home");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		WebElement CU=driver.findElement(By.xpath("//a[contains(text(),Helpline)]"));
		 CU.click();
		 
		//Verify
		 String title=driver.getTitle();  // Actual Title
		 System.out.println(title);
		 String Expected_title="Helpline";
		 
		 SoftAssert softAssert = new SoftAssert();
		 
		 softAssert.assertEquals(title, Expected_title);
		 
		 
//		Call assertAll() at the end to mark the test as failed if any soft assert fails
		 softAssert.assertAll();
		 
		
		 
		//Verify
	/*	 	String title=driver.getTitle();  // Actual Title
		 		String Etitle="Facebook";  
		 		
		 		Assert.assertEquals(title, Etitle);          
	*/	 
		 
		
		 driver.close();
	}
	

}
