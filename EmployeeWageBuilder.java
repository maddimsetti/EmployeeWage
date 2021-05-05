package employeewage;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
		int FULL_TIME = 1;
		int PART_TIME = 2;
		int WAGE_PER_HOUR = 20;
		int empWorkingHours = 0;
		double empCheck = Math.floor(Math.random() * 100) % 3;
		if (empCheck == FULL_TIME) {
			System.out.println("Employee is present");
			empWorkingHours = 8;
		} else if (empCheck == PART_TIME) {
			System.out.println("Employee is Present for PartTime");
			empWorkingHours = 4;
		} else {
			System.out.println("Employee is Absent");
			empWorkingHours = 0;
		}
		int dailyEmployeeWage = WAGE_PER_HOUR * empWorkingHours;
		System.out.println("dailyEmployeeWage:" + dailyEmployeeWage);

	}

}
