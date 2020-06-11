package ValidRegistrationFlow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class InValidSignUpPageTest extends SetSeleniumUpTest{
	
	

	@Test
	public void SignUp(){
		driver.get("https://zid.sa/");
		
		SignUpPage SignUpPage = new SignUpPage(driver);
		assertTrue(SignUpPage.isInitialized());
		
		SignUpPage.enterName("name");
		
		//enter characters instead of numbers >> invalid
		SignUpPage.enterMobile("uhytgfbvk");
		
		SignUpPage.enterCountryCode("678");
		
		SignUpPage.enterEmail("123@test.com");
		
		SignUpPage.StoreNameInEnglish("mowana");
		
		SignUpPage.StoreNameInArabic("موانا");
		
		
		ErrorMessage ErrorMessage = InValidSignUpPage.submit();
		assertTrue(ErrorMessage.isInitialized());

		assertEquals("Thank you", ErrorMessage.confirmationHeader());
	}	
}



