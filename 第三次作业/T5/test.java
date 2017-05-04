package T5;

import java.util.ArrayList;
import java.util.Iterator;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Stuff> stuffs = new ArrayList<Stuff>();
		stuffs.add(new Stuff(1001,"Tom","Market",1200));
		stuffs.add(new Stuff(1002,"Jack","Department",1300));
		stuffs.add(new Stuff(1003,"Simth","Market",2000));
		stuffs.add(new Stuff(1004,"Tony","Department",3000));
		
		Iterator<Stuff> it1 = stuffs.iterator();
		while(it1.hasNext()){
			it1.next().show();
		}
		Iterator<Stuff> it2 = stuffs.iterator();
		while(it2.hasNext()){
			Stuff stuff = it2.next();
			if(stuff.getName().equals("Jack")){
				stuff.changePay(1500);
				System.out.println("Jack的工资为"+stuff.getSalary());
			}
		}
		Iterator<Stuff> it3 = stuffs.iterator();
		while(it3.hasNext()){
			Stuff stuff = it3.next();
			if(stuff.getSalary() < 2000){
				stuff.changePay(0.2f);
			}
			stuff.show();
		}
		
		Iterator<Stuff> it4 = stuffs.iterator();
		int sum1 = 0;
		int sum2 = 0;
		int count1 = 0;
		int count2 = 0;
		while(it4.hasNext()){
			Stuff stuff = it4.next();
			if(stuff.getDepartmentname().equals("Market")){
				sum1 = sum1 + stuff.getSalary();
				count1 ++ ;
			}
			if(stuff.getDepartmentname().equals("Department")){
				sum2 = sum2 + stuff.getSalary();
				count2 ++ ;
			}
		}
		System.out.println("Market的平均工资为"+(sum1/count1));
		System.out.println("Department的平均工资为"+(sum2/count2));
		
		Iterator<Stuff> it5 = stuffs.iterator();
		while(it5.hasNext()){
			if(it5.next().getName().equals("Tom")){
				it5.remove();
			}
		}
		Iterator<Stuff> it6 = stuffs.iterator();
		while(it6.hasNext()){
			it6.next().show();
		}
	}

}
