package T3;

public class Fish extends Animal{
	public Fish(){
		super(0);
	}
	public void walk(){
		System.out.println("鱼不能行走，有没腿。");
	}
	public void eat(){
		System.out.println("大鱼吃小鱼，小鱼吃虾米。");
	}
}
