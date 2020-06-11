package ValidRegistrationFlow;

  
    import java.util.concurrent.TimeUnit;
	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.BeforeClass;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	
	 //SetSeleniumUpTest>> handles setup and teardown of WebDriver.
	 
	 
	public class SetSeleniumUpTest {
        protected static WebDriver driver;
		
		@BeforeClass
		public static void setUp(){
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@After
		public void cleanUp(){
			driver.manage().deleteAllCookies();
		}
		
		@AfterClass
		public static void tearDown(){
			driver.close();
		}	
	}
	

