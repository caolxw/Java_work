package T3;

public class Cat extends Animal implements Pet {
	public String name;
	
	public Cat(String name){
		super(4);
		this.name = name;
	}
	public Cat(){
		this(null);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Ã¨ÍæÃ«ÏßÇò¡£");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Ã¨³ÔÓã");
	}

}
