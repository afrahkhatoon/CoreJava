package com.tnsif.collectionGenerics;

import java.util.ArrayList;

class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1=new ArrayList();
		a1.add("A");
		a1.add(10);
		a1.add(null);
		a1.add(53);
		
		System.out.println(a1);
		
		a1.remove(2);
		
		System.out.println(a1);
		
		a1.add(2, "M");
		System.out.println(a1);
		
	}

}
