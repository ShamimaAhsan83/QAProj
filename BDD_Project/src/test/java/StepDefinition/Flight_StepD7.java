package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.messages.types.Duration;
import java.time.Duration;

//ctrl+shift+O will help to import all at a go

public class Flight_StepD7 {
	WebDriver driver;
	@Given("User is in the landing page")
	public void user_is_in_the_landing_page() {
	    driver= new ChromeDriver();
	    ChromeOptions options = new ChromeOptions();
//	    options.addArguments("--disable-extensions");
//	    options.addArguments("--disable-notifications");
//	    WebDriver driver = new ChromeDriver(options);
	    driver.get("https://www.cleartrip.com/");

	}

	@When("User selects the required options")
	public void user_selects_the_required_options() throws InterruptedException {
//	    WebElement d= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/div/div[1]/div[1]/div/div/div[1]/div/div/span[1]"));
//	    Select s= new Select(d);
//	    s.selectByVisibleText("One way");
		WebElement e=driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
		e.click();
		Thread.sleep(500);
		e.sendKeys("Mumbai, IN - Chatrapati Shivaji Airport (BOM)");
		Thread.sleep(500);
		Select s= new Select(e);
//		s.selectByVisibleText("Mumbai, IN - Chatrapati Shivaji Airport (BOM)");
				
		//e.sendKeys("Goa");
		   
		//e.sendKeys(Keys.ARROW_DOWN);
		//Thread.sleep(1000);
//		Actions act= new Actions(driver);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		//act.sendKeys(Keys.ENTER).perform();
//		for (int i = 0; i < 4; i++) {
//            act.sendKeys(Keys.ARROW_DOWN).perform();
//            Thread.sleep(500);  // Optional delay between each step
//        }
//		act.sendKeys(Keys.ENTER).perform();
		
        
		//Thread.sleep(500);
	}

	@Then("Provides available flights")
	public void Provides_available_flights() {
	    //driver.close();
	}
	
	

}
