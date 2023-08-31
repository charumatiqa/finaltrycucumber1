package utils;

import org.openqa.selenium.WebElement;

public class WebDriverReUsables {

	
	public static void enterText(WebElement ele, String txtstr )
	{
		ele.sendKeys(txtstr);
		
	}
	
}
