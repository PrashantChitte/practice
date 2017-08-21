package serilization;

public class TestSeri {

	public TestSeri() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Employee emp=new Employee();
		emp.setEmpID(10);
		emp.setName("Ram");
		emp.setAdd(new Address("pune","firstlane"));
		
		
	}

}
