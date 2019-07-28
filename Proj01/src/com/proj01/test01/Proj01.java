package com.proj01.test01;

import java.util.ArrayList;
import java.util.List;

public class Proj01 {
	
	List<Integer> myList;
	
	public Proj01() {
		myList = new ArrayList<Integer>();
		for (int i=0; i<20; i++) {
			myList.add(i*123);
		}
	}

	public static void main(String[] args) throws Exception {
		Proj01 proj01 = new Proj01();
		System.out.println(proj01.getIntAtCounter(14));
	}
	
	protected int getIntAtCounter(int counter) throws Exception {
		if (counter < 0) {
			throw new Exception("Counter is less than 0");
		}
		if (counter > myList.size()) {
			throw new Exception("Counter is greater than size");
		}
		
		return myList.get(counter);
	}
}
