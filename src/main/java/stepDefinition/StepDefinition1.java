package stepDefinition;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition1 {
	
	WebDriver driver;
	
	// start writing test methods for each keyword in feature file
	
	@Given("^User is on chrome browser and opens wiki home page$")
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (13)\\chromedriver.exe");
	 	driver = new ChromeDriver();
	 	driver.get("https://en.wikipedia.org/wiki/Main_Page");
	}
	
	@When("^user is on Wiki page$")
	public void validatewikipage()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);	
	}
	
	@Then("^click on create Account link$")
	public void clickcreateaccountlink()
	{
		driver.findElement(By.linkText("Create account")).click();
	}
	
	@Given("^Create Account Page has opened$")
	public void validatePageTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}

	@And("^Check all the fileds are displayed$")
	public void checkTextboxDisplayed()
	{
		boolean us=driver.findElement(By.id("wpName2")).isDisplayed();
		System.out.println(us);
	}
	
	@Then("^Enter Username, password, retype, email and click on create account button$")
	public void createaccount()
	{
		driver.findElement(By.id("wpName2")).sendKeys("username1");
		driver.findElement(By.id("wpPassword2")).sendKeys("password1");
		driver.findElement(By.id("wpRetype")).sendKeys("password1");
		driver.findElement(By.id("wpEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("wpCreateaccount")).click();
	}


}
