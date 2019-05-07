package demo;

/*import java.util.StringTokenizer;

public class StringTockenizer {
  
 public static void main(String args[]){  
   StringTokenizer st = new StringTokenizer("my name is khan"," ");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
   }  
} */

//******************

public class StringTockenizer{  
public static void main(String args[]){  
String s1="java string split method by javatpoint";  
String[] words=s1.split("\\s");//splits the string based on whitespace  
//using java foreach loop to print elements of string array  
for(String w:words){  
System.out.println(w);  
}  
}}  