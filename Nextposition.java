package practice;

import java.util.Scanner;

public class Nextposition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	int m=s.length();
	int j=0;
	int g,n,k;
		for(int i=0;i<m;i++)
		{
		g=s.charAt(i)-'0';
		if(g==s.charAt(m-1)-'0')
		{
			n=s.charAt(0)-'0';
	
			k=pow2(g,n);
		}
		else{
	n=s.charAt(i+1)-'0';
	 k=pow2(g,n);

		}
	
		j=j+k;


		}
		System.out.println(j);
	sc.close();  }
	 static  int pow2(int g,int n){
	    int total=1;
	    for(int i=1;i<=n;i++){
	        total*=g;
	    
	    }
	    
	 return total;
	  
	}  

	
}
