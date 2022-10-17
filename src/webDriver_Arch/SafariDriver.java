package webDriver_Arch;

public class SafariDriver implements WebDriver {

	public SafariDriver() {
		System.out.println("launch safari browser");
	}

	@Override
	public void get(String url) {
		System.out.println("launch url : " + url);
		
	}

	@Override
	public String getTitle() {
		
		return "Safari";
	}

	@Override
	public void click(String element) {
		System.out.println("click on :" + element);
		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering to element: " + value);
		
	}

	@Override
	public void close() {
		System.out.println("close the browser");
		
	}

}
