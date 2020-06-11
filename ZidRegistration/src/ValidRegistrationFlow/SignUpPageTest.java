package ValidRegistrationFlow;
    

    import static org.junit.Assert.assertEquals;
    import static org.junit.Assert.assertTrue;
    import   org.junit.Test;

public class SignUpPageTest extends SetSeleniumUpTest {
   
	
	
	
	
	@Test
	public void SignUp(){
		driver.get("https://zid.sa/");
		
		SignUpPage SignUpPage = new SignUpPage(driver);
		assertTrue(SignUpPage.isInitialized());
		
		SignUpPage.enterName("name");
		
		SignUpPage.enterMobile("12878864");
		
		SignUpPage.enterCountryCode("678");
		
		SignUpPage.enterEmail("123@test.com");
		
		SignUpPage.StoreNameInEnglish("mowana");
		
		SignUpPage.StoreNameInArabic("موانا");
		
		
		ReceiptPage receiptPage = SignUpPage.submit();
		assertTrue(receiptPage.isInitialized());

		assertEquals("Thank you", receiptPage.confirmationHeader());
	}	
}
	