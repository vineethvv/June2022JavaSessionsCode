package javasessions;

public class Browser {
	
	// WAF: launch a browser: FF/ CH/safari
	// param: browser name
	// return: boolean: true/false
	
	public boolean launchBrowser(String brwname) {
		
		System.out.println("Launching browser" +" " + brwname);
		
		switch (brwname) {
		case "chrome":
		System.out.println("chrome is launched");
		return true;
			
        case "firefox":
        System.out.println("FF is launched");
        return true;
			
        case "safari":
        System.out.println("safari is launched");
        return true;
   
		default:
		System.out.println("pass the right browser" + " " + brwname);
		return false;
		}
	}

	public static void main(String[] args) {
		
		Browser obj = new Browser();
		
		boolean flag = obj.launchBrowser("ie");
		System.out.println(flag);
		
		if(flag) {
			
			System.out.println("www.Amazon.com");
		}
		

	}

}
