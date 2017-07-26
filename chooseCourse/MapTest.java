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
			System.out.println("������ѧ��ID��");
			String id = reader.next();
			student st = students.get(id);
			if (st == null){
				System.out.println("������ѧ��������");
				String name = reader.next();
				student newS = new student(id,name);
				students.put(id, newS);
				System.out.println("�ɹ����");
				i ++;
			}
			else {
				System.out.println("��ѧ��ID�ѱ�ռ�ã�");
				continue;
			}
			
		}
	}
	
	public void testKeySet(){
		Set<String> key = students.keySet();
		for (String stuid : key){
			student st = students.get(stuid);
			if (st != null){
				System.out.println("ѧ����"+st.name);
			}
		}
	}
	
	public void testEntrySet(){
		Set<Entry<String,student>> entrySet = students.entrySet();
		for(Entry<String,student> en : entrySet){
			System.out.println("ȡ�ü���"+en.getKey());
			System.out.println("ȡ��ֵ��"+en.getValue().name);
		}
	}
	
	public void testRemove(){
		System.out.println("������ɾ��ѧ��ID��");
		Scanner reader = new Scanner(System.in);
		String id = reader.next();
		while(true){
			
			student st = students.get(id);
			if(st == null){
				System.out.println("��ID������");
				continue;
			}
			else{
				students.remove(id);
				System.out.println("ɾ���ɹ���");
				break;
			}
		}
	}
	
	public void testModify(){
		System.out.println("������Ҫ�޸ĵ�ѧ��ID:");
		Scanner reader = new Scanner(System.in);
		
		while(true){
			String id = reader.next();
			
			student st = students.get(id);
			if(st == null){
				System.out.println("��ID�����ڣ�");
				continue;
			}
			else {
				System.out.println("ѧ��������"+st.name);
				System.out.println("��������ѧ��������");
				String name = reader.next();
				student newS = new student(id,name);
				students.put(id, newS);
				System.out.println("�޸ĳɹ���");
				break;
			}
		}
	}
	
	public void testContain(){
		//containKey()��containValue()
		System.out.println("������Ҫ��ѯ��ѧ��ID��");
		Scanner reader = new Scanner(System.in);
		String id = reader.next();
		if (students.containsKey(id))
			System.out.println("��ѧ��ID���ڡ�����Ϊ��"+students.get(id).name);
		else System.out.println("��ѧ��ID������");
		
		System.out.println("������Ҫ��ѯѧ����������");
		String name = reader.next();
		if (students.containsValue(new student(null,name)))
			System.out.println("��ѧ������");
		else System.out.println("��ѧ��������");
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
