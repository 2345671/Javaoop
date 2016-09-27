package employee.javafiles;

public class employ {
		private int iEmpId;
		private String sEmpName;
		private float fEmpBasicSalary;
		private float fAllowance;
		private float fgrossSalary;
		private double lfIncomeTax;
		float  fNetSalary;
		
		
		employ(int iEmpId,String sEmpName,float fEmpBasicSalary){
			this.iEmpId=iEmpId;
			this.sEmpName=sEmpName;
			this.fEmpBasicSalary=fEmpBasicSalary;
			
		}

		public int getiEmpId() {
			return iEmpId;
		}

		public String getsEmpName() {
			return sEmpName;
		}

		public float getfEmpBasicSalary() {
			return fEmpBasicSalary;
		}

		public float getfAllowance() {
			return fAllowance;
		}

		public float getFgrossSalary() {
			return fgrossSalary;
		}

		public double getLfIncomeTax() {
			return lfIncomeTax;
		}
		public float getfNetSalary(){
				return fNetSalary;	
		}
		public float calNetSalary(float fBasicSalary){
			
		fAllowance=(float)(.46*fEmpBasicSalary);
		fgrossSalary=fAllowance+fEmpBasicSalary;
		if(fgrossSalary<5000)
			lfIncomeTax=0;
		else if(fgrossSalary>5000 &&fgrossSalary<10000)
			lfIncomeTax=.1*fgrossSalary;
		else if(fgrossSalary>10000 && fgrossSalary<20000)
			lfIncomeTax=.2*fgrossSalary;
		else
				lfIncomeTax=.3*fgrossSalary;
		
		setfNetSalary((float)(fgrossSalary-lfIncomeTax));
		return getfNetSalary();
		
			
		
		}
		public void display(){
		System.out.println("Employee Basic Salary:\t"+this.getfEmpBasicSalary()+"\n");
		System.out.println("Employee Allowance:\t"+this.getfAllowance()+"\n");
		System.out.println("Employee gross Salary:\t"+this.getFgrossSalary()+"\n");
		System.out.println("Employee Income Tax:\t"+this.getLfIncomeTax()+"\n");
		System.out.println("Employee Net Salary:\t"+this.getfNetSalary()+"\n");
}
	
			
		
		

		public void compare(){
			
		}

		public void setfNetSalary(float fNetSalary) {
			this.fNetSalary = fNetSalary;
		}
}
