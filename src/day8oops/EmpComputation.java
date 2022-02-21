package day8oops;

/*
* Calculating Daily Employee Wage 
* Assuming Wageperhour is 60 
* Assuming FullDayHour is 8
*/
public class EmpComputation {

	public static final int IS_PRESENT = 1;
	public static final int SALARY_PER_HR = 20;

	public static void employeeAttendace() {

		// Use Random function for Attendance check

		double empCheck = Math.floor((Math.random() * 10) % 2);
		int Working_Hr = 0;
		if (empCheck == IS_PRESENT) {
			Working_Hr = 8;
		}
		double Salary = Working_Hr * SALARY_PER_HR;
		System.out.println("Employee Salary is = " + Salary + "$");
	}

	public static void main(String[] args) {
		EmpComputation.employeeAttendace();
	}

}
