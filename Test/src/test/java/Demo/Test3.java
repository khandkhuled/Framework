package Demo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws Exception {
		
	
		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		WebElement Login=driver.findElement(By.xpath("//input[@id='email']"));
		Login.sendKeys("Khandkhuledipak@gmail.com");
		
		WebElement Pass=driver.findElement(By.xpath("//input[@id='pass']"));
		Pass.sendKeys("Test@123");
		
		WebElement Btn=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		Btn.click();
		Thread.sleep(2000);
		
		String PT=driver.getTitle();
		System.out.println(PT);
		
		TakesScreenshot sc=(TakesScreenshot)driver;
		File Source=sc.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\Dipak\\git\\Framework\\Test\\Screenshot\\RandomString.png";
		
		File dest=new File(path);
		FileUtils.copyFile(Source, dest);
		
		
		


	}
/*
	private static TakesScreenshot TakeScreenshot(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
