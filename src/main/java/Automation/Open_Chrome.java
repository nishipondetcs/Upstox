package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Chrome {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/maps/@21.3414736,77.687969,15z");
	
}
}
