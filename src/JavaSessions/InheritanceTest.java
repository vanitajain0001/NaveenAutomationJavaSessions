package JavaSessions;


public class InheritanceTest {

	public static void main(String[] args) {
		 InheritanceRegistrationPage in = new InheritanceRegistrationPage();
		 in.WebApp();
		 in.pageUrl("Amazon.co.uk");
		 in.pageLauched();
		 in.timeout();
		 System.out.println(in.userName("Vj@gmail.com")); 
		 System.out.println(in.pwd("vj123"));
		 in.changePwd();
		 in.timeout();
		 
		 InheritancePage pn = new InheritanceRegistrationPage();
		 pn.pageUrl("abc");
		 pn.pageLauched();
		 pn.timeout();
		 
		 
		 //InheritancePage p1= (InheritancePage) new InheritanceWebApp();
		// p1.pageLauched();
	}

}
