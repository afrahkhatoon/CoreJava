package com.tnsif.association;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Address address=new Address("KalaPather","Hyderabad","TS","5000064");
		
		//pass a object of address class
		
		Person person=new Person("Maryam",address);
		
		person.displayInfo();
	}
		

}
