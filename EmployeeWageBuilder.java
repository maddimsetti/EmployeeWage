package employeewage;

public class EmployeeWageBuilder {
	public static final int FULL_TIME = 1;
	public static final int PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
		int empWorkingHours = 0;
		int empCheck = (int) Math.floor(Math.random() * 100) % 3;
		switch (empCheck) {
		case FULL_TIME:
			empWorkingHours = 8;
			break;
		case PART_TIME:
			empWorkingHours = 4;
			break;
		default:
			empWorkingHours = 0;
			break;
		}
		int dailyEmployeeWage = WAGE_PER_HOUR * empWorkingHours;
		System.out.println("dailyEmployeeWage:" + dailyEmployeeWage);

	}

}
