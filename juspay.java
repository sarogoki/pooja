package practice;


	
	    import java.util.*;
	    
	    public class Weird {

	        public static void main(String[] args) {

	            Scanner sc=new Scanner(System.in);
	            String s=sc.nextLine();      
	            sc.close();
	            String  rev = "";
	   
	            int length = s.length();
	       
	            for ( int i = length - 1 ; i >= 0 ; i-- )
	               rev = rev + s.charAt(i)+"-";
	       
	            System.out.println(rev);
	            
	        }
	    }
