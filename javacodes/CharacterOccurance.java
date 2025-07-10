package javacodes;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {

    public static void main(String[] args) {
        // String we want to check occurrences of each character
        
    	String input = "TATATATA";
    	
    	Map<Character, Integer> charcocc = new HashMap<>();
    	
    		
    	for(int i=0; i<input.length(); i++) {
    		
    		char ch= input.charAt(i);
    		
    		
    		if(charcocc.containsKey(ch)) {
    		
    			charcocc.put(ch, charcocc.get(ch)+1);
    			
    		}else {
    			charcocc.put(ch,1);
    				
    			}
    	}
    
    
    
    for(Map.Entry<Character, Integer> e : charcocc.entrySet()){
    	
    		System.out.println("Character " +e.getKey() + " occurs " + e.getValue() + " times ");
    		
    	
    }
    	
  
    }
}
    
  
    	
    	
        
        