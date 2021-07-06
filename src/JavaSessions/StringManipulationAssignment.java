package JavaSessions;

public class StringManipulationAssignment {
	
	
	public Boolean check(String a, String b) {
		
	
	return a.equals(b);
		
	}
	
	public void RemoveSpace() {
		
		String x = "    Hello     World    ";
		String y = x.replaceAll(" ", "");
		System.out.println(y);
		
	}
	
	
	public static void main(String[] args) {
		
		StringManipulationAssignment sm = new StringManipulationAssignment();
		Boolean a= sm.check("Hello", "Hello");
		System.out.println(a);
		sm.RemoveSpace();
	}
}