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
	
private int computeWage(){
	 int empHrs=0;
   int totalEmpHrs=0;
   int totalWorkingDays=0;

   while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
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
return totalEmpHrs * empRatePerHour;

}

public static void main(String[] args) 
{
	EmpWagePart2Usingclass emp=new EmpWagePart2Usingclass("DMart",20,2,10);
	EmpWagePart2Usingclass emp1=new EmpWagePart2Usingclass("Reliance",30,3,10);
	EmpWagePart2Usingclass emp2=new EmpWagePart2Usingclass("Info",30,3,10);
	System.out.println("Total Emp Wage For Company " +emp.company + " is: " + emp.computeWage());
   System.out.println("Total Emp Wage For Company " +emp1.company + " is: " + emp1.computeWage());
	System.out.println("Total Emp Wage For Company " +emp2.company + " is: " + emp2.computeWage());
}
 
}

