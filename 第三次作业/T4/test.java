package T4;

import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List students = new ArrayList();
		students.add(new Student("����","class1","java",85));
		students.add(new Student("���ֶ�","class1","C#",79));
		students.add(new Student("����","class2","C#",52));
		students.add(new Student("����","class2","java",48));
		Iterator<Student> it1 = students.iterator();
		while(it1.hasNext()){
			it1.next().show();
		}
		int sum1 = 0;
		int sum2 = 0;
		int count1 = 0;
		int count2 = 0;
		Iterator<Student> it2 = students.iterator();
		while(it2.hasNext()){
			Student stu = it2.next();
			if(stu.getclassName().equals("class1")){
				sum1 += stu.getScore();
				count1 ++;
			}
		}
		System.out.println("class1���ܷ�Ϊ��"+sum1+"ƽ����Ϊ��"+(sum1/count1));
		Iterator<Student> it3 = students.iterator();
		while(it3.hasNext()){
			Student stu = it3.next();
			if(stu.getscoreName().equals("java")){
				sum1 += stu.getScore();
				count1 ++;
			}
			if(stu.getscoreName().equals("C#")){
				sum2 += stu.getScore();
				count2 ++;
			}
		}
		System.out.println("java���ܷ�Ϊ��"+sum1+"ƽ����Ϊ��"+(sum1/count1));
		System.out.println("C#���ܷ�Ϊ��"+sum2+"ƽ����Ϊ��"+(sum2/count2));
	}

}
