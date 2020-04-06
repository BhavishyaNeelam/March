package Mar;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
public class Mar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.gecko.driver","C:\\Users\\welcome\\Downloads\\Compressed\\geckodriver.exe");

		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\selenium-chrome-driver-3.14.0.exe");

		WebDriver d= new FirefoxDriver();

		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		System.out.println("Title is "+d.getTitle());

		d.findElement(By.xpath("//*[@id='email']")).sendKeys("bhavishya137@gmail.com");

		d.findElement(By.xpath("//*[@id='pass']")).sendKeys("lighthouseshores");

		d.findElement(By.xpath("//*[@value='Log In']")).click();*/

		System.setProperty("webdriver.gecko.driver","C:\\Users\\welcome\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		int studentID;

		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		d.get("https://www.facebook.com/");
		d.manage().window().maximize();

		/*	File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		try {

			FileUtils.copyFile(src, new File("E:\\Screenshot"+System. currentTimeMillis()+".png")); 
			}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
		 */



	}

}
