package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigates {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/?");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[class=\"_2hvTZ pexuQ zyHYP\"]")).sendKeys("nishiponde");
	Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Nishi123@");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("div[class=\"             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    \"]")).click();
    		
	
	 
	 
}
}
