package day8oops;

/*
 * Calculating Wages for a Month
 */

public class EmpComputation {

	public static final int IS_FULL_TIME = 1;
	public static final int SALARY_PER_HR = 20;
	public static final int IS_PART_TIME = 2;
	public static final int NO_OF_DAYS = 20;

	public static void employeeAttendace() {

		int Working_Hr = 0;
		int empwage = 0;
		int Totalempwage = 0;

		//using for loop to checking condition
		for (int day = 0; day < NO_OF_DAYS; day++) {
			int empCheck = (int) Math.floor((Math.random() * 10) % 3);

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
			empwage = Working_Hr * SALARY_PER_HR;
			Totalempwage += empwage;
			System.out.println("Emp Wage :  " + empwage);
		}

		System.out.println("Total Emp Wage : " + Totalempwage);
	}

	public static void main(String[] args) {

		EmpComputation.employeeAttendace();	//calling mathod
	}

}
