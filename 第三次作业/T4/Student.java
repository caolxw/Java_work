package T4;

public class Student {
	private String name;
	private String className;
	private String scoreName;
	private int score;
	
	public Student(String name,String className,String scoreName,int score){
		this.name = name;
		this.className = className;
		this.scoreName = scoreName;
		this.score = score;
	}
	public String getName(){
		return name;
	}
	public String getclassName(){
		return className;
	}
	public String getscoreName(){
		return scoreName;
	}
	public int getScore(){
		return score;
	}
	public void show(){
		System.out.println("������"+name+" �༶��"+className+" �γ̣�"+scoreName+" �ɼ�:"+score);
	}
	
}
