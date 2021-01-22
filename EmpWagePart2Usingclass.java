public class EmpWagePart2Usingclass{

	public static final int isPartTime=1;
   public static final int isFullTime=2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;

	public EmpWagePart2Usingclass(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
	{
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
	}
	
public static void main(String[] args) 
{
	EmpWagePart2Usingclass emp=new EmpWagePart2Usingclass("DMart",20,2,10);

	
	int empHrs=0;
	int totalEmpHrs=0;
	int totalWorkingDays=0;

	while(totalEmpHrs <= emp.maxHoursPerMonth && totalWorkingDays < emp.numOfWorkingDays)
	{
		totalWorkingDays++;
		int empCheck=(int) Math.floor(Math.random() * 10) %3;
				
		switch (empCheck){
			case isPartTime:
							empHrs=4;
						break;
			case isFullTime:
							empHrs=8;
						break;
			default:
					empHrs=0;
	}
			totalEmpHrs +=empHrs;
			System.out.println("Days: " + totalWorkingDays + "Emp Hrs: " +empHrs);

	}
int totalEmpWage=totalEmpHrs * emp.empRatePerHour;
System.out.println("Total Emp Wage for Company: " + emp.company + " is : " +totalEmpWage);

}
}
 
