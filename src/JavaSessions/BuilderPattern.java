package JavaSessions;

public class BuilderPattern {
	private String a;
	public String getA() {
		return a;
	}
	public BuilderPattern login(String un , String pwd) {
		System.out.println("logged in");
		return this;
		
	}
	public BuilderPattern search(String product) {
		String a= "lipstick";
		this.a = a;
		return this;
		
	}
	public BuilderPattern payment(String card, String pass) {
		System.out.println("payment successful");
		return this;
	}
	public BuilderPattern logout() {
		System.out.println("logged out");
		return this;
	}

	public static void main(String[] args) {
		BuilderPattern b = new BuilderPattern();
		b.login("vj@gmail.com", "vj123").search("Chanel").payment("1234567772", "777").logout();
		String x = b.getA();
		System.out.println(x);
		
	}

}
