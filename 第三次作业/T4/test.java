package T4;

import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List students = new ArrayList();
		students.add(new Student("张三","class1","java",85));
		students.add(new Student("周乐儿","class1","C#",79));
		students.add(new Student("王涛","class2","C#",52));
		students.add(new Student("李明","class2","java",48));
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
		System.out.println("class1的总分为："+sum1+"平均分为："+(sum1/count1));
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
		System.out.println("java的总分为："+sum1+"平均分为："+(sum1/count1));
		System.out.println("C#的总分为："+sum2+"平均分为："+(sum2/count2));
	}

}
