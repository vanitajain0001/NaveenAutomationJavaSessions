package JavaSessions;

public class InheritanceRegistrationPage extends InheritancePage {
	
	private String a;
	

	public String userName(String a) {
		this.a=a;
		System.out.println("Enter username");
		return a;
	
	}
	

	public String pwd(String b) {

		System.out.println("Enter pwd");
		return b;
	}

	public void changePwd() {

		System.out.println("enter new password");
	}

}
