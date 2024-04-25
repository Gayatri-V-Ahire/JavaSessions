package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
     
		//ArrayList -- class: default : Dynamic Array
		
				//create the Object of ArrayList: new keyword
				
				ArrayList ar = new ArrayList();//pc=0, vc=10
				System.out.println(ar.size());//pc=0
				
				
				ar.add(100);//0 pc=1, vc=9
				
				ar.add(200);//1
				
				System.out.println(ar);
				
				System.out.println(ar.size());//2
				
				ar.add(300);//2
				ar.add(400);//3
				
				System.out.println(ar.size());//4
		 		
				ar.add(500);//4
				ar.add(600);//5

				System.out.println(ar.size());//6
				System.out.println(ar);
				
				ar.remove(5);

				System.out.println(ar.size());//5
				System.out.println(ar);
				
				ar.remove(0);
				System.out.println(ar.size());//5
				System.out.println(ar);
				
				ar.add(300);
				System.out.println(ar);
				
				ar.add(12.33);
				ar.add(true);
				ar.add('c');
				ar.add("Naveen");
				
				System.out.println(ar);
				
				
				//marksList --> Generic : int -> Integer
				ArrayList<Integer> marksList = new ArrayList<Integer>();
				marksList.add(100);
				marksList.add(1200);
				
				//empNames: -- generic: String
				ArrayList<String> empNamesList = new ArrayList<String>();
				empNamesList.add("Naveen");
				empNamesList.add("Tom");
				empNamesList.add("Rahul");
				
				System.out.println(empNamesList);
				System.out.println(empNamesList.size());
				
				//emp info: name, age, salary, isActive, gender
				ArrayList<Object> empDataList = new ArrayList<Object>();
				empDataList.add("Rahul");//0
				empDataList.add(30);//1
				empDataList.add(50.33);//2
				empDataList.add(true);//3
				empDataList.add('m');//4
				empDataList.add(null);//5
				
				System.out.println(empDataList);
				System.out.println(empDataList.size());

				
				
				ArrayList list = new ArrayList(5);//vc=5,pc=0
				//0 1 2 3 4
				//vc=0, pc=5
				//pc/2=5/2=2
				//vc = 2
		
		
	}

}
