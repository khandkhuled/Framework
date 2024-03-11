package Demo;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		 driver=new ChromeDriver();
		 driver.get("http://172.16.15.49:8002/candidate/otr");
		 driver.manage().window().maximize();
		 String a="123";
		Thread.sleep(3000);
		
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("Window.ScrollBy(0,4000)","");
		
////		WebElement gen=driver.findElement(By.xpath("//div[@id='react-select-4-placeholder']"));
////		gen.click();
//		
//
//		WebElement Name=driver.findElement(By.xpath("//input[@id='candidate_name']"));
//		String AA="asqwertyuiopasdfghjklzxcvbnm";
//		 Name.sendKeys(RandomStringUtils.random(5, AA));
//		
//		 WebElement Na=driver.findElement(By.xpath("//div[@id='react-select-5-placeholder']"));
//		 Na.click();
//		 Na.click();
	
	
		
		
		
		
		
		
	/*	Mobile.sendKeys("9876567890");
		Thread.sleep(2000);
		WebElement SO=driver.findElement(By.xpath("//*[@id=\"my-colId-mobile\"]/div/div[1]/div/div/div/button")); 
		*/
//		WebElement SO1=driver.findElement(By.xpath());
//		SO.click();
////		String originalStr = "Hello";
////		String reversedStr = "";
////	//	int b =a.
		
//	public static void main (String args[]) {
//		Random r = new Random();
//		int rand = r.nextInt(100000000,999999999);
//		System.out.println("Random 10-digit integer:" + rand);
	
		
		
		

	}

	private static String Window(Object scrollby) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object Scrollby(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
