package employeewage;

//class Declaration
public class EmployeeWageBuilder {

	// constants
	public static final int FULL_TIME = 1;
	public static final int PART_TIME = 2;
	public final int WAGE_PER_HOUR;
	public final int WORKING_DAYS_PER_MONTH;
	public final int EMP_HOURS_IN_MONTH;
	// variable
	public final String company;
	public int totalEmployeeWage;

	// Constructor Declaration of class
	public EmployeeWageBuilder(String company, int WAGE_PER_HOUR, int WORKING_DAYS_PER_MONTH, int EMP_HOURS_IN_MONTH) {
		this.company = company;
		this.WAGE_PER_HOUR = WAGE_PER_HOUR;
		this.WORKING_DAYS_PER_MONTH = WORKING_DAYS_PER_MONTH;
		this.EMP_HOURS_IN_MONTH = EMP_HOURS_IN_MONTH;
	}

	// method1
	public int empCheck() {

		return (int) Math.floor(Math.random() * 10) % 3;
	}

	// method2
	public int totalEmployeeWage() {
		int empWorkingHours = 0, totalEmpWorkingHours = 0, totalWorkingDays = 0;
		while (totalEmpWorkingHours <= EMP_HOURS_IN_MONTH && totalWorkingDays < WORKING_DAYS_PER_MONTH) {
			totalWorkingDays++;
			switch (empCheck()) {
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
			System.out.println("Day# " + totalWorkingDays + "  EmpWorkingHours:" + empWorkingHours);
		}
		return totalEmployeeWage = totalEmpWorkingHours * WAGE_PER_HOUR;
	}

	// Override
	public String toString() {
		return "Total Wage for Company " + company + " is " + totalEmployeeWage;
	}

	// Compute
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
		EmployeeWageBuilder dmart = new EmployeeWageBuilder("Dmart", 20, 20, 100);
		dmart.totalEmployeeWage();
		System.out.println(dmart);
		EmployeeWageBuilder reliance = new EmployeeWageBuilder("Reliance", 15, 10, 50);
		reliance.totalEmployeeWage();
		System.out.println(reliance);
		EmployeeWageBuilder bigbazar = new EmployeeWageBuilder("BigBazar", 30, 25, 100);
		bigbazar.totalEmployeeWage();
		System.out.println(bigbazar);
	}
}
