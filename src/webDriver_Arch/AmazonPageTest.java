package webDriver_Arch;

public class AmazonPageTest {
	
	 static WebDriver driver;
	
	// driver --> Interface referance variable pointing to chrome/FF/Safari class
   //  driver--> Also known as reference variable of webdriver interface
	
	public static void main(String[] args) {
		
		
		// chrome
		// firefox
		// safari

		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		// SafariDriver driver = new SafariDriver();
		
		String browser = "safari";
		
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
			
		case "safari":
			driver = new SafariDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("plz pass the right browser:::" + browser);
			break;
		}
		
		
		//WebDriver driver = new ChromeDriver();// top casting
		
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.sendKeys("emailID", "naveen@gmail.com");
		driver.sendKeys("Password", "naveen@123");
		driver.click("loginBtn");

		driver.close();
		
	}

}
