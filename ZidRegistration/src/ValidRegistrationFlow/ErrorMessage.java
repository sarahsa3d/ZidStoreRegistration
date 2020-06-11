package ValidRegistrationFlow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ErrorMessage extends PageObject {

	@FindBy(xpath="//span[ @style='direction: rtl;']")
	private WebElement header;
	
	public ErrorMessage(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		return header.isDisplayed();
	}

	public String confirmationHeader(){
		return header.getText();
	}

}
