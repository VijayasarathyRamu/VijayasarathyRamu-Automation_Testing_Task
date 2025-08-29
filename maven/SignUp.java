package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUp {
	WebDriver driver = null; 
	By Fn = By.id("first_name");
	By Ln = By.id("last_name");
	By Em = By.id("email");
	By Ph = By.id("phone");
	By CN = By.id("organization");
	By Country = By.xpath("//select[@class='addressCountry form-control']");
	By AccTrail = By.xpath("//select[@id='users']");
	By Radio = By.id("type_download");
	By CheckBox1 = By.id("terms");
	By CheckBox2 = By.id("gdpr");
	By Submit = By.xpath("//button[@type='submit']");
	public void enterFN(String input)
	 {
		 driver.findElement(Fn).sendKeys(input);
	 }
	public void enterLN(String input)
	 {
		 driver.findElement(Ln).sendKeys(input);
	 }
	public void enterEmail(String input)
	 {
		 driver.findElement(Em).sendKeys(input);
	 }
	public void enterPH(String input)
	 {
		 driver.findElement(Ph).sendKeys(input);
	 }
	public void enterComName(String input)
	 {
		 driver.findElement(CN).sendKeys(input);
	 }
	public void enterCountry(String input)
	 {
		WebElement countryDropdown = driver.findElement(Country);
        Select selectCountry = new Select(countryDropdown);
        selectCountry.selectByVisibleText(input);
	 }
	public void enterAccessTrail(String input)
	 {
        WebElement accessTestrail = driver.findElement(AccTrail);
        Select count = new Select(accessTestrail);
        count.selectByValue(input);
	 }
	public void enterRadio()
	 {
		 driver.findElement(Radio).click();
	 }
	public void enterCheckBox1()
	 {
		 driver.findElement(CheckBox1).click();
	 }
	public void enterCheckBox2()
	 {
		 driver.findElement(CheckBox2).click();
	 }
	 public void submitButton()
	 {
		 driver.findElement(Submit).click();
	 
	 }
	 public SignUp(WebDriver driver)
	 {
		 this.driver = driver;
	 }
	

	
}
