package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {
	
	public static void main(String args[])
	{
		/*Integer[] arr = {1,55,65,12,71,05,3,99};
		
		Arrays.sort(arr); 
		System.out.println(arr);        							 // By Default Ascending
		
	//	Arrays.sort(arr, Collections.reverseOrder()); 				 // For Descending
		System.out.println(Arrays.toString(arr));  
	
	}*/
	
	
		ArrayList<String> arr = new ArrayList<>();
		arr.add("pooja");
		arr.add("Arti");
		arr.add("piya");
		
		Collections.sort(arr); 										//Ascending
		System.out.println(arr);
	
		Collections.sort(arr, Collections.reverseOrder()); 			//Descending
		System.out.println(arr);
	}

}
