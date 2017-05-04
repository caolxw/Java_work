package T6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;


public class Test {
	public static void main(String[] args){
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(1,"Tom",20));
		students.add(new Student(2,"Jack",21));
		students.add(new Student(3,"John",22));
		students.add(new Student(4,"Tom",20));
		students.add(new Student(5,"John",22));
		
		HashSet<Student> newStu = new HashSet<Student>();
		newStu.addAll(students);
		List<Student> newstudent = new ArrayList<Student>();
		newstudent.addAll(newStu);
		Collections.sort(newstudent);
		Iterator<Student> it = newstudent.iterator();
		while(it.hasNext()){
			it.next().showInfo();
		}
	}
}
