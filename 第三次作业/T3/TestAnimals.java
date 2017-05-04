package T3;

public class TestAnimals {
	public static void main(String[] args){
		Fish d = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();
		
		d.eat();
		d.walk();
		
		System.out.println(c.getName());
		c.setName("Tom");
		System.out.println(c.getName());
		c.eat();
		c.play();
		c.walk();
		
		a.eat();
		a.walk();
		
		e.eat();
		e.walk();
		
		p.play();
		p.setName("Tom");
		p.getName();
	}
}
