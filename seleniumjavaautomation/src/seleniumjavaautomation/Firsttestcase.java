package seleniumjavaautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Firsttestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32 (4)//chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/selenium/newtours");
	    WebElement username= driver.findElement(By.name("userName"));
	    username.sendKeys("mercury");
	    driver.findElement(By.name("password")).sendKeys("loki");
	    driver.findElement(By.name("submit")).click();
	    String s=driver.getTitle();
	    System.out.println(s);
	    String a="Welcome: Mercury Tours";
	    if(a.equals(s)) {
	    	System.out.println("Test case passed");
	    }
	}

}
