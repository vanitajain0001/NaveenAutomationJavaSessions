package Interface;

public class MaxHospital extends HospitalManagment implements UN,WHO,UKMed,USMed,IndiaMed {

	@Override
	public void gastroenterology() {
		
		System.out.println("Gastroenterology department");

		
	}

	@Override
	public void orthopedics() {
		
		System.out.println("Orthopedics department");

		
	}

	@Override
	public void phsiotherapy() {
		
		System.out.println("phsiotherapy department");

		
	}

	@Override
	public void cardiology() {
		
		System.out.println("Cardiology department");

		
	}

	@Override
	public void neurology() {
		
		System.out.println("Neurology department");

		
	}

	@Override
	public void oncology() {

		System.out.println("Oncology department");

	}

	@Override
	public void ent() {
		
		System.out.println("ENT department");

		
	}

	@Override
	public void opthalmology() {
		
		System.out.println("Opthalmology department");

		
	}

	@Override
	public void hematology() {

		System.out.println("Hematology department");

	}

	@Override
	public void emergencyServices() {
		
		System.out.println("Emergency Services ");

		
	}

	@Override
	public String covidtest(String a) {
		
		System.out.println("Covid test");
		return a;

		
	}

	@Override
	public void funds() {
		
		System.out.println("Funds provided to max Hospital");

		
	}
	@Override
	public void bloodBank() {
		
	}
	@Override
    public void pharmacy() {
		
		
	}

}
