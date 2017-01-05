package org.noel.markham.basics;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ForEach {

	@Test
	public void forEach() {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		items.forEach((a,b)->System.out.println("Item : " + a + " Count : " + b));
		
		items.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});
	}

}
