package chooseCourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	public List coursesToSelect;
	
	public ListTest(){
		this.coursesToSelect = new ArrayList();//List是接口，不能实例化。运用ArrayList实例化
	}
	
	public void testAdd(){
		//向集合里面添加元素
		course cr1 = new course("1","数据结构");
		coursesToSelect.add(cr1);
		course temp = (course)coursesToSelect.get(0);
		System.out.println("添加了课程："+temp.id+" "+temp.name);
		
		course cr2 = new course("2","C语言");
		coursesToSelect.add(0, cr2);
		course temp1 = (course)coursesToSelect.get(0);
		System.out.println("添加了课程："+temp1.id+" "+temp1.name);
		
		course[] cr3 = {new course("3","离散数学"), new course("4","汇编语言")};
		coursesToSelect.addAll(Arrays.asList(cr3));
		
		course[] cr4 = {new course("5","高等数学"),new course("6","大学英语"),new course("7","大学物理")};
		coursesToSelect.addAll(2, Arrays.asList(cr4));
	}
	
	public void testGet(){
		//获得List里面的元素
		int size = coursesToSelect.size();
		
		//for方法
		for(int i = 0; i < size; i++){
			course cr = (course)coursesToSelect.get(i);
			System.out.println("(运用for)课程："+cr.id+" "+cr.name);
		}
		
		//迭代器方法
		Iterator it = coursesToSelect.iterator();
		while(it.hasNext()){
			course cr = (course)it.next();
			System.out.println("（运用迭代器）课程："+cr.id+" "+cr.name);
		}
		
		//foreach方法
		//当元素放入集合时，类型是被忽略的
		for(Object obj : coursesToSelect){
			course cr = (course)obj;
			System.out.println("（运用foreach）课程："+cr.id+" "+cr.name);
		}
	}
	
	public void testModify(){
		//修改元素
		coursesToSelect.set(0, new course("2","java编程思想"));
		testGet();
	}
	
	public void testRemove(){
		//删除元素
		coursesToSelect.remove(3);
		
		course[] cr = {(course)coursesToSelect.get(4),(course)coursesToSelect.get(5)};
		coursesToSelect.removeAll(Arrays.asList(cr));
		testGet();
	}
	
	public static void main(String[] args){
		ListTest lt = new ListTest();
		lt.testAdd();
		System.out.println("有如下课程待选：");
		lt.testGet();
		System.out.println("修改课程信息后：");
		lt.testModify();
		System.out.println("删除课程之后：");
		lt.testRemove();
	}
}
