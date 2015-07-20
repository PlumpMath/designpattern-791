package com.dp.factory;
import java.util.*;

public class ShowIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = Arrays.asList(
				new String[] {"fountain", "rocket", "sparkler"});
		
		Iterator iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next().getClass().getName());
			System.out.println(iter.getClass().getName());
		}
	}

}
