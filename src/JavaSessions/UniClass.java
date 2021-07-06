package JavaSessions;

import java.util.ArrayList;

public class UniClass {

	public static void main(String[] args) {
		UniversityClass uni = new UniversityClass("JDU", "India");
		System.out.println(uni.getName());
		System.out.println(uni.getCountry());
		
		System.out.println("------------------------");
		
		ArrayList<String> course = new ArrayList<String> ();
		course.add("Engeneering");
		course.add("MBA");
		
		UniversityClass uni1 = new UniversityClass("Calcutta Uni", "India", "02/07/1850", course );
		System.out.println(uni1.getName());
		System.out.println(uni1.getCountry());
		System.out.println(uni1.getStablishedDate());
		System.out.println(uni1.getCourse());
		System.out.println("------------------------");
		
		ArrayList<String> plugins = new ArrayList<String>();
		plugins.add("last pass");
		plugins.add("add blocker");
		plugins.add("colour picker");
		Browser br = new Browser("Chrome" ,"webKit" , "Chrome 86", plugins);
		System.out.println(br.getBrowserName());
		System.out.println(br.getVendorName());
		System.out.println(br.getCurrentVersion());
		System.out.println(br.getPlugins());
		br.setBrowserName("safari");
		System.out.println(br.getBrowserName());

	}

}
