package prob04;

public class Depart extends Employee {
	
	private String department;
	
	public Depart(String name, int salary, String department) {
		this.setName(name);
		this.setSalary(salary);
		this.setDepartment(department);
	}
	public Depart() {
		
	}
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void getInformation() {
		System.out.println( "이름:" + getName() + " 연봉:" + getSalary() + " 부서:" + department );
	}
}
