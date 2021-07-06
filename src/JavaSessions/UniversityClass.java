package JavaSessions;

import java.util.ArrayList;
import java.util.List;

public class UniversityClass {

	private String name;
	private String country;
	private String stablishedDate;
	private List<String> course;
	

	public UniversityClass(String name, String country) {
		this.name = name;
		this.country = country;

	}

	public UniversityClass(String name, String country, String stablishedDate) {

		this.name = name;
		this.country = country;
		this.stablishedDate = stablishedDate;

	}

	public UniversityClass(String name, String country, String stablishedDate, ArrayList<String> course) {

		this.name = name;
		this.country = country;
		this.stablishedDate = stablishedDate;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public String getStablishedDate() {
		return stablishedDate;
	}

	
	public ArrayList<String> getCourse() {
		return (ArrayList<String>) course;
	}
	

	

}
