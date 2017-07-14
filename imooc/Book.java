package imooc;

import java.util.Scanner;

class minglingException extends Exception{
	public minglingException(String msg){
		super(msg);
	}
}

class tushuException extends Exception{
	public tushuException(String msg){
		super(msg);
	}
}

class Book{
	String books[] = {"高数","线代","大物","Java","数据结构"};
	boolean flage = true;
	Scanner reader = new Scanner(System.in);
	public void book() throws tushuException, minglingException{
		while(flage){
			System.out.println("输入指令：1--按照书名查找图书；2--按照编号查找图书；3--退出；");
			int n = reader.nextInt();
			String s = reader.nextLine();
			switch(n){
			case 1 :{
				System.out.println("输入书名：");
				String bookName = reader.nextLine();
				for(int i = 0; i < books.length; i++){
					if(bookName.equals(books[i])){
						System.out.println("book:"+bookName);
						break;
					}
					else{
						throw new tushuException("图书不存在！");
					}
				}
				break;
			}
			case 2 :{
				System.out.println("输入 编号：");
				int num = reader.nextInt();
				if(num > 0 && num < books.length){
					System.out.println("book:"+books[num]);
				}
				else{
					throw new tushuException("图书不存在！");
				}
				break;
			}
			case 3:{
				flage = false;
				break;
			}
			default :
				throw new minglingException("命令输入错误！请根据提示输入数字命令！");
			}
		}
	}
}
