package chooseCourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {

	public List<course> coursesToSelect;
	private Scanner reader;
	public student stu;
	
	public SetTest(){
		this.coursesToSelect = new ArrayList<course>();
		this.reader = new Scanner(System.in);
	}
	
	public void testAdd(){
		//向集合里面添加元素
		course cr1 = new course("1","数据结构");
		coursesToSelect.add(cr1);
		
		course cr2 = new course("2","C语言");
		coursesToSelect.add(0, cr2);
		
		course[] cr3 = {new course("3","离散数学"), new course("4","汇编语言")};
		coursesToSelect.addAll(Arrays.asList(cr3));
		
		course[] cr4 = {new course("5","高等数学"),new course("6","大学英语"),new course("7","大学物理")};
		coursesToSelect.addAll(2, Arrays.asList(cr4));
	}
	
	public void testForeath(){
		for(Object obj : coursesToSelect){
			course cr = (course)obj;
			System.out.println("（运用foreach）课程："+cr.id+" "+cr.name);
		}
	}
	
	public void testListContains(){
		System.out.println("请输入课程名称：");
		String name = reader.next();
		
		course cr = new course();
		cr.name = name;
		if (coursesToSelect.contains(cr)){
			System.out.println("该课程存在！");
			System.out.println("课程："+cr.name+"的索引位置为"+coursesToSelect.indexOf(cr));
		}
		else {
			System.out.println("该课程不存在！");
		}
		
	}
	
	public void SelectCourse(){
		stu = new student("1","小明");
		System.out.println("欢迎学生 "+stu.name+" 选课");
		
		for (int i = 0; i < 3; i ++){
			System.out.println("请输入课程ID:");
			String cId = reader.next();
			
			for (course cr : coursesToSelect){
				if (cr.id.equals(cId))
					stu.courses.add(cr);
			}
		}
	}
	
	public void testSetContain(){
		System.out.println("请输入课程名称：");
		String name = reader.next();
		course cr = new course();
		cr.name = name;
		if (stu.courses.contains(cr)) 
			System.out.println("该课程已选");
		else System.out.println("该课程未选");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest st = new SetTest();
		st.testAdd();
		st.testListContains();
		st.testForeath();
		
//		st.SelectCourse();
//		st.testSetContain();
//				
		//st.testListContains();
	}

}
