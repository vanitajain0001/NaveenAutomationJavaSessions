package JavaSessions;

public class InheritanceHomePage extends InheritancePage {
	
	public void homePage() {
		
		System.out.println("Amazon Home Page");
	}
	@Override
	public void timeout () {
		
		 int timeout =10;
		 System.out.println(timeout + " secs");
		 
	}
	public void account() {
		System.out.println("Welcome Vanita");
		
	}
	
	public void headerLinks() {
		
		System.out.println("header links");
	}

}
