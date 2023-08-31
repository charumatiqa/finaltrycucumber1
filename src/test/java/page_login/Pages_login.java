package page_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static utils.WebDriverReUsables.enterText;

public class Pages_login {

	public WebDriver driver;
	
	public  Pages_login(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		this.driver = driver;
	}
	@FindBy(linkText="Register")
	WebElement clickreg;
	
	public void fnClickRegister() {
		clickreg.click();
	}
	@FindBy(id="customer.firstName")
	WebElement fname;
	@FindBy(id="customer.lastName")
	WebElement lname;
	@FindBy(id="customer.address.street")
	WebElement demoaddress;
	@FindBy(id="customer.address.city")
	WebElement democity;
	@FindBy(id="customer.address.state")
	WebElement demostate;
	@FindBy(id="customer.address.zipCode")
	WebElement demozip;
	@FindBy(id="customer.ssn")
	WebElement demossn;
	@FindBy(id="customer.username")
	WebElement usernames1;
	@FindBy(id="customer.password")
	WebElement password;
	@FindBy(id="repeatedPassword")
	WebElement repassword;
	@FindBy(xpath="//input[@class='button'and @value='Register']")
	WebElement clickregister ;
	
	
	public void fnregistration(String fname1, String lname1, String add1, String city1, String state1, String zip1, String ssn1)
	{
//		fname.sendKeys("charufirst1");
		enterText(fname,fname1);
		enterText(lname, lname1);
		enterText(demoaddress,add1);
		enterText(democity, city1);
		enterText(demozip, zip1);
		enterText(demostate, state1);
		enterText(demossn, ssn1);
	
}
	
	  public void userreg(String ustring1, String pstring2,String repstring3)
	  {
			enterText(usernames1, ustring1);
			enterText(password, pstring2);
			enterText( repassword, repstring3);
	  }
	  
	  public void clickonregister()
	  {
		  clickregister.click();
	  }
	  
}
