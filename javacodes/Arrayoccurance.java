package javacodes;

import java.util.HashMap;
import java.util.Map;

public class Arrayoccurance {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,2,5,4,5};
		
		Map<Integer, Integer> arroccur = new HashMap<>();
		
		for(int i = 0; i<arr.length; i++) {
					
			int element = arr[i];
					
				if(arroccur.containsKey(element)) {
						arroccur.put(element, arroccur.get(element)+1);
				}
					
						else {
					arroccur.put(element, 1);
					
				
				}

	}
	
	for(Map.Entry<Integer, Integer> e :arroccur.entrySet()) {
		System.out.println("Array " +e.getKey() +" Occurs " + e.getValue() +" times");
		
	}
	
}
}
