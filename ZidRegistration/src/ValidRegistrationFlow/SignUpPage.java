package ValidRegistrationFlow;

      import org.openqa.selenium.WebDriver;
      import org.openqa.selenium.WebElement;
      import org.openqa.selenium.support.FindBy;
      
      
      public class SignUpPage extends PageObject {
    	  
    	  
      @FindBy(xpath="//a[@class='mobileNav__link a--white']")
      private WebElement register;
    	  
      @FindBy(id="name")
  	  private WebElement name;
      
      @FindBy(xpath="//input[@id='mobile']")
  	  private WebElement mobile;
      
      @FindBy(id="input-group-1tr")
  	  private WebElement CountryCode;
      
      @FindBy(id="registration_email")
  	  private WebElement email;
      
      @FindBy(xpath="//input[@id='registration_password']")
  	  private WebElement password;
      
      @FindBy(xpath="//button[@class='btn next-tab-btn']")
  	  private WebElement nextButton;
      
       //user info page 2
      
      @FindBy(xpath="//input[@id='store_username']")
      private WebElement StoreNameInEnglish;
      
      @FindBy(xpath="//input[@id='store_name']")
      private WebElement StoreNameInArabic;
      

      @FindBy(xpath="//select[@id='store_category_id']")
      private WebElement StoreCategory;
      
      
      @FindBy(xpath="//input[@id='started_business_before_registration_yes']")
      private WebElement YesBusinessadioutton;
      
      @FindBy(xpath="//input[@id='started_business_before_registration_no']")
      private WebElement NoBusinessadioutton;
      
      @FindBy(xpath="//button[@class='btn btn-primary login-btn']")
      private WebElement RegisterButton;
      
      
      public SignUpPage(WebDriver driver) {
  		super(driver);
  	}
  		
  		public boolean isInitialized() {
  			return name.isDisplayed();
  		}
  		
  		public void register(){
  			register.click();
  		}
  		
  		public void enterName(String name){
  			this.name.clear();
  			this.name.sendKeys(name);
  		}
  		
  		public void enterMobile(String mobile){
  			this.mobile.clear();
  			this.mobile.sendKeys(mobile);
  		}
  		
  		public void enterCountryCode(String CountryCode){
  			this.CountryCode.clear();
  			this.CountryCode.sendKeys(CountryCode);
  		}
  		
  		public void enterEmail(String email) {
  			this.email.clear();
  			this.email.sendKeys(email);
  		}
  		
  		
  		public void enterPassword(String Password) {
  			this.password.clear();
  			this.password.sendKeys(Password);
  		}
  		
  		public void nextButton(){
  			nextButton.click();
  		}
  		
  		//page 2 fields
  		
  		public void StoreNameInEnglish(String StoreName){
  			this.StoreNameInEnglish.clear();
  			this.StoreNameInEnglish.sendKeys(StoreName);
  		}
  		
  		public void StoreNameInArabic(String StoreName) {
  			this.StoreNameInArabic.clear();
  			this.StoreNameInArabic.sendKeys(StoreName);
  		}
  	
  		 //category dropdown
  		
  		
  		//radio button
  		public void YesBusinessadioutton(){
  			YesBusinessadioutton.click();
  		}
  		
  		
  		public void NoBusinessadioutton(){
  			NoBusinessadioutton.click();
  		}
  		
  		
  		
  		
  		
  		public ReceiptPage submit(){
  			nextButton.click();
  			return new ReceiptPage(driver);
  		}
  	}
  	