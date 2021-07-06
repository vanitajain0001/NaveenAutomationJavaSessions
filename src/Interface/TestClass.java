package Interface;

public class TestClass {

	public static void main(String[] args) {
		
		FortisHospital fs = new FortisHospital();
		fs.bloodBank();
		fs.cardiology();
		System.out.println(fs.covidtest("Plese wear a face mask"));
		fs.emergencyServices();
		fs.funds();
		System.out.println(UN.amount);
		fs.bloodBank();
	    fs.pharmacy();
		
		
		
		}
	}


