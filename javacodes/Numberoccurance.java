package javacodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Numberoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num = "10101100";
		
		Map<Character, Integer> freqcount = new HashMap<>();
		
		for(int i= 0; i< num.length(); i++) {
		char ch = num.charAt(i);
			
		if(freqcount.containsKey(ch)) {
			freqcount.put(ch, freqcount.get(ch) + 1);
			
		}else {
			freqcount.put(ch,1);
		}
				
	}

		for(Map.Entry<Character, Integer> entry : freqcount.entrySet()) {
			System.out.println(" Number " + entry.getKey()+ " occurs " +entry.getValue() + " times. ");
		}
		
	}
}
