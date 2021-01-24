public class EmpWagePart2Usingclass{

	public static final int isPartTime=1;
   public static final int isFullTime=2;

	private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmpWagePart2Usingclass(){
	  companyEmpWageArray = new CompanyEmpWage[5];
	}
	
	private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
	{
		companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company, empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
		numOfCompany++;
	}
	
	private void computeEmpWage()
	{
		for(int i=0;i<numOfCompany;i++)
		{
			int totalEmpWage=this.computeEmpWage(companyEmpWageArray[i]);
			System.out.println("Total Emp Wage for Company " + companyEmpWageArray[i].company + " is: " +totalEmpWage );
		}
	}
	
	private int computeEmpWage(CompanyEmpWage companyEmpWage){
	 int empHrs=0;
 	 int totalEmpHrs=0;
    int totalWorkingDays=0;

   while(totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays)
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
return totalEmpHrs * companyEmpWage.empRatePerHour;

}

public static void main(String[] args) 
{
<<<<<<< HEAD
	EmpWagePart2Usingclass emp=new EmpWagePart2Usingclass("DMart",20,2,10);
	EmpWagePart2Usingclass emp1=new EmpWagePart2Usingclass("Reliance",30,3,10);
<<<<<<< HEAD
	System.out.println("Total Emp Wage For Company " +emp.company + " is: " + emp.computeWage());
   System.out.println("Total Emp Wage For Company " +emp1.company + " is: " + emp1.computeWage());
=======
	EmpWagePart2Usingclass emp=new EmpWagePart2Usingclass();
	emp.addCompanyEmpWage("DMart",20,2,10);
	emp.addCompanyEmpWage("Reliance",30,2,20);
	emp.computeEmpWage();
>>>>>>> arrayUseCase-10
}
 
}
=======
	EmpWagePart2Usingclass emp2=new EmpWagePart2Usingclass("Info",30,3,10);
	System.out.println("Total Emp Wage For Company " +emp.company + " is: " + emp.computeWage());
   System.out.println("Total Emp Wage For Company " +emp1.company + " is: " + emp1.computeWage());
	System.out.println("Total Emp Wage For Company " +emp2.company + " is: " + emp2.computeWage());
}
 
}

>>>>>>> saveTotalWageForEachCompanyUC-9
