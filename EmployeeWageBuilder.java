package employeewage;

public class EmployeeWageBuilder {
	public static final int FULL_TIME = 1;
	public static final int PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;
	public static final int WORKING_DAYS_PER_MONTH = 20;
	public static final int EMP_HOURS_IN_MONTH = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
		int empWorkingHours = 0, totalEmpWorkingHours = 0, totalWorkingDays = 0;
		while (totalEmpWorkingHours <= EMP_HOURS_IN_MONTH && totalWorkingDays < WORKING_DAYS_PER_MONTH) {
			totalWorkingDays++;
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
			totalEmpWorkingHours += empWorkingHours;
			System.out.println("Day# " + totalWorkingDays + "  EmpWorkingHours: " + empWorkingHours);
		}
		int totalEmployeeWage = totalEmpWorkingHours * WAGE_PER_HOUR;
		System.out.println("*****Total Salary for a Month:" + totalEmployeeWage);

	}

}
