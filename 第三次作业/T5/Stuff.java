package T5;

public class Stuff {
	private int workNum;
	private String name;
	private String departmentName;
	private int salary;
	
	public Stuff(int workNum, String name, String departmentName, int salary){
		this.workNum = workNum;
		this.name = name;
		this.departmentName = departmentName;
		this.salary = salary;
	}
	public void show(){
		System.out.println("工号："+workNum+" 姓名："+name+" 部门："+departmentName+" 工资："+salary);
	}
	
	public int getWorknum(){
		return workNum;
	}
	public String getName(){
		return name;
	}
	public String getDepartmentname(){
		return departmentName;
	}
	public int getSalary(){
		return salary;
	}
	
	public int changePay(int pay){
		salary = pay;
		return salary;
	}
	public int changePay(float rate){
		salary += salary * rate;
		return salary;
	}
}
