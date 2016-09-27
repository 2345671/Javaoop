package employee.javafiles;

public class empDemo {

	public static void main(String[] args) {
		employ res=new employ(15,"res",1000.00f);
		System.out.println("Employee details:\n");
		res.fNetSalary=res.calNetSalary(res.getfEmpBasicSalary());
		res.display();

	}

}
