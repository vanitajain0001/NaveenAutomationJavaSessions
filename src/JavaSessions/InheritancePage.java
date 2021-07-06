package JavaSessions;

public class InheritancePage extends InheritanceWebApp {
	
	public String pageUrl(String a) {
		
		return a;
	}
	
	public void timeout() {
		int timeout = 20;
		System.out.println(timeout + " secs");
	}
	
	public void pageLauched() {
		
		System.out.println("Welcome to Amazon UK");
	}

}
