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
		//�򼯺��������Ԫ��
		course cr1 = new course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		
		course cr2 = new course("2","C����");
		coursesToSelect.add(0, cr2);
		
		course[] cr3 = {new course("3","��ɢ��ѧ"), new course("4","�������")};
		coursesToSelect.addAll(Arrays.asList(cr3));
		
		course[] cr4 = {new course("5","�ߵ���ѧ"),new course("6","��ѧӢ��"),new course("7","��ѧ����")};
		coursesToSelect.addAll(2, Arrays.asList(cr4));
	}
	
	public void testForeath(){
		for(Object obj : coursesToSelect){
			course cr = (course)obj;
			System.out.println("������foreach���γ̣�"+cr.id+" "+cr.name);
		}
	}
	
	public void testListContains(){
		System.out.println("������γ����ƣ�");
		String name = reader.next();
		
		course cr = new course();
		cr.name = name;
		if (coursesToSelect.contains(cr)){
			System.out.println("�ÿγ̴��ڣ�");
			System.out.println("�γ̣�"+cr.name+"������λ��Ϊ"+coursesToSelect.indexOf(cr));
		}
		else {
			System.out.println("�ÿγ̲����ڣ�");
		}
		
	}
	
	public void SelectCourse(){
		stu = new student("1","С��");
		System.out.println("��ӭѧ�� "+stu.name+" ѡ��");
		
		for (int i = 0; i < 3; i ++){
			System.out.println("������γ�ID:");
			String cId = reader.next();
			
			for (course cr : coursesToSelect){
				if (cr.id.equals(cId))
					stu.courses.add(cr);
			}
		}
	}
	
	public void testSetContain(){
		System.out.println("������γ����ƣ�");
		String name = reader.next();
		course cr = new course();
		cr.name = name;
		if (stu.courses.contains(cr)) 
			System.out.println("�ÿγ���ѡ");
		else System.out.println("�ÿγ�δѡ");
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
