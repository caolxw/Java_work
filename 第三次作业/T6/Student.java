package T6;

public class Student implements Comparable<Student>{
	private int classNum;
	private String name;
	private int age;
	
	public Student(int classNum,String name,int age){
		this.classNum = classNum;
		this.name = name;
		this.age = age;
	}
	
	public void showInfo(){
		System.out.println("sid:"+classNum+",name:"+name+",age"+age);
	}
	public int getNum(){
		return classNum;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Student)){
			return false;
		}
		Student stu = (Student)obj;
		if(this.age ==stu.age && this.name == stu.name){
			return true;
		}
		else{
			return false;
		}
	}
	public int hashCode(){
		return this.name.hashCode() + this.age;
	}
	public int compareTo(Student o1){
		if(this.classNum > o1.classNum){
			return 1;
		}
		if(this.classNum == o1.classNum){
			return 0;
		}
		return -1;
	}
}
