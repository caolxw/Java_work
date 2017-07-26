package chooseCourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest {

	public void testSort1(){
		List<Integer> li = new ArrayList();
		Random rand = new Random();
		Integer k;
		for (int i = 0; i < 10; i ++){
			do{
				k = rand.nextInt(100);
			}while(li.contains(k));
			li.add(k);
			System.out.println("成功添加整数"+k);
			
		}
		System.out.println("-----排序前-----");
		
		for (int a : li){
			System.out.print(a+" ");
		}
		System.out.println();
		
		Collections.sort(li);
		
		System.out.println("-----排序后-----");
		for (int a : li){
			System.out.print(a + " ");
		}
		System.out.println();
		
	}
	
	public void testSort2(){
		List<String> li = new ArrayList<String>();
		
		li.add("microsoft");
		li.add("google");
		li.add("lenovo");
		
		System.out.println("-----排序前-----");
		
		for (String a : li){
			System.out.print(a + " ");
		}
		System.out.println();
		
		Collections.sort(li);

		System.out.println("-----排序后------");
		for (String a : li){
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
	public void testSort3(){
		List<String> li = new ArrayList<String>();
		
		String base = "abcdefghijklmnopqrstuvwxyz0123456789 ";
		Random rand = new Random();
		StringBuffer sb = new StringBuffer();
		String str = null;
		for (int i = 0; i < 10; i ++){
			do{
				for (int j = 0; j < 10; j ++){
					int num = rand.nextInt(base.length());
					sb.append(base.charAt(num));
				}
			}while(li.contains(sb));
			str = sb.toString();
			li.add(str);
			System.out.println("成功添加了："+str);
			sb.delete(0, sb.length());
		}
		
		System.out.println("------排序前------");
		
		for (String a : li){
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.println("------排序后------");
		Collections.sort(li);
		
		for (String a : li){
			System.out.print(a + " ");
		}
		System.out.println();
	}

	public void testSort4(){
		List<student> li = new ArrayList<student>();
		
		Random rand = new Random();
		
		li.add(new student(rand.nextInt(1000)+"","Jack"));
		li.add(new student(rand.nextInt(1000)+"","Sam"));
		li.add(new student(rand.nextInt(1000)+"","Ruby"));
		
		System.out.println("-------排序前-------");
		
		for (student st : li){
			System.out.println(st.id +" "+st.name);
		}
		
		System.out.println("-----排序后-----");
		
		Collections.sort(li);
		for (student st : li){
			System.out.println(st.id +" "+st.name);
		}
		
		System.out.println("按照学生姓名排序：");
		Collections.sort(li, new studentComparator());
		for (student st : li){
			System.out.println(st.id +" "+st.name);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionsTest ct = new CollectionsTest();
		//ct.testSort1();
		//ct.testSort2();
		//ct.testSort3();
		ct.testSort4();
	}

}
