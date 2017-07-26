package chooseCourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	public List coursesToSelect;
	
	public ListTest(){
		this.coursesToSelect = new ArrayList();//List�ǽӿڣ�����ʵ����������ArrayListʵ����
	}
	
	public void testAdd(){
		//�򼯺��������Ԫ��
		course cr1 = new course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		course temp = (course)coursesToSelect.get(0);
		System.out.println("����˿γ̣�"+temp.id+" "+temp.name);
		
		course cr2 = new course("2","C����");
		coursesToSelect.add(0, cr2);
		course temp1 = (course)coursesToSelect.get(0);
		System.out.println("����˿γ̣�"+temp1.id+" "+temp1.name);
		
		course[] cr3 = {new course("3","��ɢ��ѧ"), new course("4","�������")};
		coursesToSelect.addAll(Arrays.asList(cr3));
		
		course[] cr4 = {new course("5","�ߵ���ѧ"),new course("6","��ѧӢ��"),new course("7","��ѧ����")};
		coursesToSelect.addAll(2, Arrays.asList(cr4));
	}
	
	public void testGet(){
		//���List�����Ԫ��
		int size = coursesToSelect.size();
		
		//for����
		for(int i = 0; i < size; i++){
			course cr = (course)coursesToSelect.get(i);
			System.out.println("(����for)�γ̣�"+cr.id+" "+cr.name);
		}
		
		//����������
		Iterator it = coursesToSelect.iterator();
		while(it.hasNext()){
			course cr = (course)it.next();
			System.out.println("�����õ��������γ̣�"+cr.id+" "+cr.name);
		}
		
		//foreach����
		//��Ԫ�ط��뼯��ʱ�������Ǳ����Ե�
		for(Object obj : coursesToSelect){
			course cr = (course)obj;
			System.out.println("������foreach���γ̣�"+cr.id+" "+cr.name);
		}
	}
	
	public void testModify(){
		//�޸�Ԫ��
		coursesToSelect.set(0, new course("2","java���˼��"));
		testGet();
	}
	
	public void testRemove(){
		//ɾ��Ԫ��
		coursesToSelect.remove(3);
		
		course[] cr = {(course)coursesToSelect.get(4),(course)coursesToSelect.get(5)};
		coursesToSelect.removeAll(Arrays.asList(cr));
		testGet();
	}
	
	public static void main(String[] args){
		ListTest lt = new ListTest();
		lt.testAdd();
		System.out.println("�����¿γ̴�ѡ��");
		lt.testGet();
		System.out.println("�޸Ŀγ���Ϣ��");
		lt.testModify();
		System.out.println("ɾ���γ�֮��");
		lt.testRemove();
	}
}
