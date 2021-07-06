package Interface;

public class FortisHospital extends HospitalManagment implements UN,WHO,UKMed,USMed,IndiaMed{

	@Override
	public void gastroenterology() {
		
		System.out.println("gastroenterology department");
		
	}

	@Override
	public void orthopedics() {
		
		System.out.println("orthopedics department");
		
	}

	@Override
	public void phsiotherapy() {
		
		System.out.println("phsiotherapy department");
		
		
	}

	@Override
	public void cardiology() {
		
		System.out.println("cardiology department");
		
	}

	@Override
	public void neurology() {
		
		
		System.out.println("neurology department");
	}

	@Override
	public void oncology() {
		
		System.out.println("oncology department");
		
	}

	@Override
	public void ent() {
		
		System.out.println("ent department");
		
	}

	@Override
	public void opthalmology() {
		
		System.out.println("opthalmology department");
		
	}

	@Override
	public void hematology() {
		
		System.out.println("hematology department");
		
	}

	@Override
	public void emergencyServices() {
		
		System.out.println("Emergency Services ");
		
	}

	@Override
	public String covidtest(String a) {
		
		System.out.println("Covid test area");
		return a;
		
	}

	@Override
	public void funds() {
		
		System.out.println("Funds provided to Fortis Hospital");
		
	}
	@Override
	public void bloodBank() {
		
		System.out.println("Become a blood donor to save lives");
		
	}
	@Override
	public void pharmacy() {
		
		System.out.println("Pharmacy open 24 hours");
		
	}

}
