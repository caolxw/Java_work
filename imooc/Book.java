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
	String books[] = {"����","�ߴ�","����","Java","���ݽṹ"};
	boolean flage = true;
	Scanner reader = new Scanner(System.in);
	public void book() throws tushuException, minglingException{
		while(flage){
			System.out.println("����ָ�1--������������ͼ�飻2--���ձ�Ų���ͼ�飻3--�˳���");
			int n = reader.nextInt();
			String s = reader.nextLine();
			switch(n){
			case 1 :{
				System.out.println("����������");
				String bookName = reader.nextLine();
				for(int i = 0; i < books.length; i++){
					if(bookName.equals(books[i])){
						System.out.println("book:"+bookName);
						break;
					}
					else{
						throw new tushuException("ͼ�鲻���ڣ�");
					}
				}
				break;
			}
			case 2 :{
				System.out.println("���� ��ţ�");
				int num = reader.nextInt();
				if(num > 0 && num < books.length){
					System.out.println("book:"+books[num]);
				}
				else{
					throw new tushuException("ͼ�鲻���ڣ�");
				}
				break;
			}
			case 3:{
				flage = false;
				break;
			}
			default :
				throw new minglingException("������������������ʾ�����������");
			}
		}
	}
}
