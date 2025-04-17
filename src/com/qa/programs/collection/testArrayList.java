package com.qa.programs.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class testArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mahesh");
		list.add("Wadgure");
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
