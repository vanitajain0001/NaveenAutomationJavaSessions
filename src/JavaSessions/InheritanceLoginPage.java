package JavaSessions;

public class InheritanceLoginPage extends InheritancePage {
	
	public void userName(String a) {
		
		System.out.println("Enter username");
		
	}
	
	public void pwd(String b) {
		
		System.out.println("Enter pwd");
	}
    @Override
	public void timeout() {
		
		int timeout = 30;
		System.out.println(timeout + " secs");
	}

}
