package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//ctrl+shift+O will help to import all at a go

public class Login_StepD {
	WebDriver driver;
	@Given("User is in the homepage")
	public void user_is_in_the_homepage() {
	    driver= new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/newtours/index.php");
	}

	@When("User enters valid credentials")
	public void user_enters_valid_credentials() {
	    driver.findElement(By.name("userName")).sendKeys("shams");
	    driver.findElement(By.name("password")).sendKeys("Shams1");
	    driver.findElement(By.name("submit")).click();
	}
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_credentials(String UserName, String Password) {
	    driver.findElement(By.name("userName")).sendKeys(UserName);
	    driver.findElement(By.name("password")).sendKeys(Password);
	    driver.findElement(By.name("submit")).click();
	}

	@When("User enters invalid credentials")
	public void user_enters_invalid_credentials() {
		driver.findElement(By.name("userName")).sendKeys("Shams");
        driver.findElement(By.name("password")).sendKeys("Shams13");
        driver.findElement(By.name("submit")).click();
    }
	
	@Then("Successful login")
	public void successful_login() {
	    driver.close();
	}
	
	@Then("Unsuccessful login with error message")
	public void unsuccessful_login_with_error_message() {
	    WebElement ele=driver.findElement(By.tagName("span"));
	    System.out.println(ele.getText());
	    driver.close();
	}

}
