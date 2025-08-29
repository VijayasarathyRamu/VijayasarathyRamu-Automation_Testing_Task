package testngdemo;

import java.io.FileReader;
import java.util.Properties;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
 
public class Task {
  @Test
  public void login() throws Exception {
	  FileReader fr = new FileReader("C:\\Users\\vijayasarathy.r\\Testing\\TestNG\\src\\testngdemo\\task.properties");
	  Properties p = new Properties();
	  p.load(fr);
	  WebDriver wd = new ChromeDriver();
	  wd.get(p.getProperty("url"));
	  wd.manage().window().maximize();
	  System.out.println(wd.getTitle());
	  
	  Thread.sleep(3000);
//	  https://qavbox.github.io/demo/signup/
	  String Firstwebsite= wd.getWindowHandle();
	  wd.switchTo().newWindow(WindowType.TAB);
	  wd.get(p.getProperty("url1"));
	  Thread.sleep(3000);
	  wd.switchTo().window(Firstwebsite);
		
		
	  Thread.sleep(2000);
	  WebElement fn = wd.findElement(By.id("first_name"));
	  fn.sendKeys(p.getProperty("fn"));
	  System.out.println("First Name: " + fn.getAttribute("value"));
	  
	  WebElement lastname = wd.findElement(By.id("last_name"));
	  Thread.sleep(2000);
	  lastname.sendKeys(p.getProperty("ln"));
	  System.out.println("Last Name: " + lastname.getAttribute("value"));
	  
	  WebElement email = wd.findElement(By.id("email"));
	  Thread.sleep(2000);
	  email.sendKeys(p.getProperty("email"));
	  System.out.println("Email: " + email.getAttribute("value"));
	  
	  WebElement phone = wd.findElement(By.id("phone"));
	  Thread.sleep(2000);
	  phone.sendKeys(p.getProperty("phno"));
	  System.out.println("Phone Number: " + phone.getAttribute("value"));
	  
	  
	  WebElement companyname = wd.findElement(By.id("organization"));
	  companyname.sendKeys(p.getProperty("company"));
	  System.out.println("Company Name: " + companyname.getAttribute("value"));
	  Thread.sleep(2000);
	  
	  WebElement countryDropdown = wd.findElement(By.xpath("//select[@class='addressCountry form-control']"));
	  Select selectCountry = new Select(countryDropdown);
	  selectCountry.selectByVisibleText("India");
	  
	  Thread.sleep(2000);  
	  WebElement accessTestrail = wd.findElement(By.xpath("//select[@id='users']"));
	  Select count = new Select(accessTestrail);
	  
//	  Thread.sleep(2000);
	  count.selectByValue("20");
	  
	  Thread.sleep(2000);  
	  WebElement radio = wd.findElement(By.id("type_download"));
	  radio.click();
	  
	  Thread.sleep(2000);
	  WebElement checkbox1 = wd.findElement(By.id("terms"));
	  checkbox1.click();
	  
	  Thread.sleep(2000);
	  WebElement checkbox2 = wd.findElement(By.id("gdpr"));
	  checkbox2.click();
	  
	  Thread.sleep(2000);
	  WebElement submit = wd.findElement(By.xpath("//button[@type='submit']"));
	  submit.click();
	  
	  Thread.sleep(2000);
	  wd.close();	
	  wd.quit();
  }
}
 