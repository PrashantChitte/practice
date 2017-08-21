package serilization;

import java.io.Serializable;

public class Employee implements Serializable{

	private int empID;
	private String name;
	private Address add;
	
	public Employee() {
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

}
