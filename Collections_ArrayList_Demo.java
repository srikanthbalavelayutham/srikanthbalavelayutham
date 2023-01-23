package collectionslearning;

import java.util.ArrayList;
import java.util.List;

public class Collections_ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//declaration
		
		ArrayList myList=new ArrayList();//by default heteogenious datatype allowed
		ArrayList <Integer>myList1=new ArrayList<Integer>();//specific data type also allowed
		List myList2=new ArrayList();//by using List class we can declare it.
		
//Adding data elements into ArrayList
		
		myList.add(100);
		myList.add(10.5);
		myList.add("Welcome");
		myList.add(100);
		myList.add(true);
		myList.add(null);
		myList.add(null);
	//We can also add object of another class in the arrayList
		
		Employee2 empobj=new Employee2();
	Employee2 emp1=new Employee2();
		
		//myList.add(empobj);
		//myList.add(emp1);
		
		
	System.out.println(myList);
	
	//Size of array_list
	
	System.out.println(myList.size());
	
	//Remove value from ArrayList
	
	myList.remove(3);
	
	System.out.println("After Rmoving : "+myList);
	
	//Inserting value in the middle of the list
	
	myList.add(3,700);
	
	System.out.println("After Inserting : "+myList);
	
	//Getting valuues from Array_List
	
	System.out.println(myList.get(2));
	
	//Reading all values from arraylist one by one
	
	for(Object x:myList) {
		System.out.println(x);
	}
	
	//if we want clear all the elements from arraylist then use clear() method
	
	//myList.clear();
		
	}
	

	
}
class Employee2
{
	int empnum;
	String emp_name;
	
	


private void display() {
System.out.println("display");

}

}
