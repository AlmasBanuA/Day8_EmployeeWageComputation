package day8oops;

/*
 * Refactoring the Code to write a Class Method to Compute Employee Wage
 */
public class EmpComputation {

	static final int IS_PRESENT = 1;
	static final int IS_PART_TIME = 2;

	public static void employeeAttendace(int SALARY_PER_HOUR, int TOTAL_WORK_DAY, int MAX_WORKING_HOUR,
			int FULL_DAY_WORKING_HOUR) {
		int empCheck;
		int empHr = 0;
		int totalSalary = 0;
		int day = 0;

		/*
		 * using while to execute both the conditions
		 */
		while (day < TOTAL_WORK_DAY && (empHr + FULL_DAY_WORKING_HOUR) <= MAX_WORKING_HOUR) {
			day++;
			
			//random function using to get a randomly values
			empCheck = (int) (Math.floor(Math.random() * 10) % 3);

			/*
			 * using switch case statement to execute anyone one of the case
			 */
			switch (empCheck) {
			case IS_PRESENT:
				empHr += FULL_DAY_WORKING_HOUR;
				break;

			case IS_PART_TIME:
				empHr += (FULL_DAY_WORKING_HOUR / 2);
				break;

			default:
				empHr += 0;
				break;
			}

			System.out.println("Working day : " + day + " (Present : " + empCheck + ")");

		}

		totalSalary = empHr * SALARY_PER_HOUR;
		System.out.println("Monthly Emp Wage : " + totalSalary + "\nTotal working hour : " + empHr);

	}

	public static void main(String[] args) {

		EmpComputation.employeeAttendace(20, 20, 100, 8);
	}

}
