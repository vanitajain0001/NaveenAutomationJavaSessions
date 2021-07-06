package JavaSessions;

public class MyDemoCartRegistration2 {

	public static void main(String[] args) {
		MyDemoCartRegistraton m1 = new MyDemoCartRegistraton("Vanita");
		System.out.println(m1.firstName);
		MyDemoCartRegistraton m2 = new MyDemoCartRegistraton("Vanita", "Jain");
		System.out.println(m2.firstName + " " + m2.lastName);
		MyDemoCartRegistraton m3 = new MyDemoCartRegistraton("Vanita" , "Jain" , "vjain0001@gmail.com");
		System.out.println(m3.firstName + " " + m3.lastName + " " + m3.email);
		MyDemoCartRegistraton m4 = new MyDemoCartRegistraton("Vanita", "Jain" , "vjain0001@gmail.com" , "077668888");
		System.out.println(m4.firstName + " " + m4.lastName + " " + m4.email + " " + m4.telephone);
		MyDemoCartRegistraton m5 = new MyDemoCartRegistraton("Vanita", "Jain" , "vjain0001@gmail.com" , "077668888" ,"AbCdE$$");
		System.out.println(m5.firstName + " " + m5.lastName + " " + m5.email + " " + m5.telephone + " " + m5.password);
	}

}
