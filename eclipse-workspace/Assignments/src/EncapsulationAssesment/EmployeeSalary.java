package EncapsulationAssesment;

public class EmployeeSalary {
	
	private double salary;
	EmployeeSalary(){
		
	}
	EmployeeSalary(double salary){
		this.salary=salary;
		}
	public void setSalary(double salary) {
		if(salary>0) {
			this.salary=salary;
		}else {
			System.out.println("Salary cannot be less than 0");
		}
	}
	public double getSalary() {
		if(salary>0) {
			return salary;

		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSalary e = new EmployeeSalary();
		e.setSalary(50000);
		System.out.println("Salary is "+e.getSalary());

	}

}
