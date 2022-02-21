package day8oops;

/*
 * Solving using Switch Case Statement
 */
public class EmpComputation {

	public static final int IS_FULL_TIME = 1;
	public static final int SALARY_PER_HR = 20;
	public static final int IS_PART_TIME = 2;

	public static void employeeAttendace() {

		// using random function to empcheck
		int empCheck = (int) Math.floor((Math.random() * 10) % 3);
		int Working_Hr = 0;
		switch (empCheck) {
		case IS_FULL_TIME:
			Working_Hr = 8;
			break;
		case IS_PART_TIME:
			Working_Hr = 4;
			break;
		default:
			Working_Hr = 0;
		}
		double Salary = Working_Hr * SALARY_PER_HR;
		System.out.println("Emplyee Salary is = " + Salary + "$");
	}

	public static void main(String[] args) {
		EmpComputation.employeeAttendace();  //calling method
	}

}
