package com.haha;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestMap {
	
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 111);
		map.put(2, 222);
		map.put(3, 333);
		map.put(4, 444);
		testIterator(map);
	}

	public static void testIterator( Map<Integer, Integer> map){
		
		Iterator<Map.Entry<Integer, Integer>> iterator  = map.entrySet().iterator();
		
		while(iterator.hasNext()){
			Map.Entry<Integer, Integer> entry = iterator.next();
			System.out.println(entry.getKey()+",,,,"+entry.getValue());
		}
	}
}
