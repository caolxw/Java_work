package imooc;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		while(b.flage){
			try{
			b.book();
		}
		catch(tushuException e){
			System.out.println(e.getMessage());
		}
		catch(minglingException e){
			System.out.println(e.getMessage());
		}
		}
	}

}
