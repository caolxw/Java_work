package T3;

public abstract class Animal {
	protected int legs;
	
	protected Animal(int legs){
		this.legs = legs;
	}
	public abstract void eat();
	
	public void walk(){
		System.out.println("动物可以行走，它有"+legs+"腿");
	}
}
