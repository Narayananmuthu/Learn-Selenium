package challenges;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	@Test
	public void upload() throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
	//	String path = System.getProperty("user.dir");
		
	//	System.out.println(path);
		
		
		
		
		  driver.get("http://leafground.com/pages/upload.html");
		  driver.findElement(By.name("filename")).sendKeys("C:\\Users\\dell\\Desktop\\framework_architechture_new.png");
		 
		
		
		
		
			/*
			 * driver.get("https://www.naukri.com/"); WebElement upload =
			 * driver.findElement(By.id("file_upload")).sendKeys(path+
			 * "\\data\\sabapathyk.docx"); //absolute path
			 */ 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
		 

	}
}