class EmpWagePart2Usingclass{

		public static final int isPartTime=1;
      public static final int isFullTime=2;
      public static final int empRatePerHr=20;
		public static final int numOfWorkingDays=2;
		public static final int maxHrsInMonth=10;	

	int empHrs=0;
	int totalEmpHrs=0;
	int totalWorkingDays=0;
	void compute(){
	while(totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDays)
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
int totalEmpWage=totalEmpHrs * empRatePerHr;
System.out.println("Total Emp Wage: " +totalEmpWage);


}
public static void main(String[] args){
	EmpWagePart2Usingclass e=new EmpWagePart2Usingclass();
	e.compute();
}}
