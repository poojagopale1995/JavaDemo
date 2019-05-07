package demo;
import java.util.Map;
import java.util.TreeMap;


public class stringcount {

	    public static void main(String[] args) {

	        String str = "ramakoteswararao";

	        char[] char_array = str.toCharArray();

	        System.out.println("The Given String is : " + str);

	    Map<Character, Integer> charCounter = new TreeMap<Character, Integer>();
	    System.out.println(char_array.toString());

	        for (char i : char_array) {
	        	System.out.println(charCounter.get(i));
	    charCounter.put(i,charCounter.get(i) == null ? 1 : charCounter.get(i) + 1);

	        }

	    for (Character key : charCounter.keySet()) {
	  System.out.println("occurrence of '" + key + "' is  "+ charCounter.get(key));
	        }

	    }

	
}
