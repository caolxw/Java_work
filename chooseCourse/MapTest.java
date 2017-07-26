package chooseCourse;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	public Map<String, student> students;
	
	public MapTest(){
		this.students = new HashMap<String, student>();
	}
	
	public void testPut(){
		Scanner reader = new Scanner(System.in);
		int i = 0;
		while(i < 3){
			System.out.println("请输入学生ID：");
			String id = reader.next();
			student st = students.get(id);
			if (st == null){
				System.out.println("请输入学生姓名：");
				String name = reader.next();
				student newS = new student(id,name);
				students.put(id, newS);
				System.out.println("成功添加");
				i ++;
			}
			else {
				System.out.println("该学生ID已被占用！");
				continue;
			}
			
		}
	}
	
	public void testKeySet(){
		Set<String> key = students.keySet();
		for (String stuid : key){
			student st = students.get(stuid);
			if (st != null){
				System.out.println("学生："+st.name);
			}
		}
	}
	
	public void testEntrySet(){
		Set<Entry<String,student>> entrySet = students.entrySet();
		for(Entry<String,student> en : entrySet){
			System.out.println("取得键："+en.getKey());
			System.out.println("取得值："+en.getValue().name);
		}
	}
	
	public void testRemove(){
		System.out.println("请输入删除学生ID：");
		Scanner reader = new Scanner(System.in);
		String id = reader.next();
		while(true){
			
			student st = students.get(id);
			if(st == null){
				System.out.println("该ID不存在");
				continue;
			}
			else{
				students.remove(id);
				System.out.println("删除成功！");
				break;
			}
		}
	}
	
	public void testModify(){
		System.out.println("请输入要修改的学生ID:");
		Scanner reader = new Scanner(System.in);
		
		while(true){
			String id = reader.next();
			
			student st = students.get(id);
			if(st == null){
				System.out.println("该ID不存在！");
				continue;
			}
			else {
				System.out.println("学生姓名："+st.name);
				System.out.println("请输入新学生姓名：");
				String name = reader.next();
				student newS = new student(id,name);
				students.put(id, newS);
				System.out.println("修改成功！");
				break;
			}
		}
	}
	
	public void testContain(){
		//containKey()和containValue()
		System.out.println("请输入要查询的学生ID：");
		Scanner reader = new Scanner(System.in);
		String id = reader.next();
		if (students.containsKey(id))
			System.out.println("该学生ID存在。姓名为："+students.get(id).name);
		else System.out.println("该学生ID不存在");
		
		System.out.println("请输入要查询学生的姓名：");
		String name = reader.next();
		if (students.containsValue(new student(null,name)))
			System.out.println("该学生存在");
		else System.out.println("该学生不存在");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mp = new MapTest();
		mp.testPut();
		mp.testKeySet();
		
//		mp.testRemove();
//		mp.testEntrySet();
		
//		mp.testModify();
//		mp.testEntrySet();
//		
		mp.testContain();
	}

}
