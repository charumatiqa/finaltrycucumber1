package stepDefinitions;

import org.openqa.selenium.WebDriver;
import static utils.WebDriverUtils.*;
import static utils.WebDriverUtils.linkUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_login.Pages_login;

public class LoginStepDefinitions {
	
	WebDriver driver;
	public  Pages_login loginobj;
	
	
	
	public LoginStepDefinitions() throws InterruptedException {
		driver = getDriver();
		Thread.sleep(5000);
		loginobj=new Pages_login(driver);
//		class object = new class ();
		
	}
	
	
	@Given("user enters appUrl and click on register")
	public void user_enters_app_url_and_click_on_register() {
	    // Write code here that turns the phrase above into concrete actions
	
		
		linkUrl();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginobj.fnClickRegister();
	}

	
		
	


	@When("user enters {string}, {string},{string},{string},{string}, {string}, and {string}")
	public void user_enters_and(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    // Write code here that turns the phrase above into concrete actions
	 loginobj.fnregistration(string, string2, string3, string4, string5, string6, string7);
	 try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@When("user enters {string},{string} and {string}")
	public void user_enters_and( String string8,String string9,String string10) {
	    // Write code here that turns the phrase above into concrete actions
	 loginobj.userreg(string8, string9, string10);
	 try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	

	@Then("clicks register")
	public void clicks_register() {
	    // Write code here that turns the phrase above into concrete actions
	  loginobj.clickonregister();
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Given("user enter {string} completes registeration")
	public void user_enter_completes_registeration(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  
	}



}
