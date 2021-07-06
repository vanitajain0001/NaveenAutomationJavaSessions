package Interface;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		String me = "My name is Vanita and I am happy to attend Naveen automation labs sessions";
		
		// logic to print the index of all the occurrence of char 'a' in the above string
		
		for(int i =0; i<me.length(); i++) {
			
			char x = me.charAt(i);
			if(x == 'a') {
				System.out.println(i);
			}
			
			String lang = "Java_Phython_Php_Javascript";
			String language[] =lang.split("_");
			for(String e : language) {
				System.out.println(e);
				
		   Arrays.asList(language).stream().forEach(o -> System.out.println(o));
				
			}
		}
	}
}