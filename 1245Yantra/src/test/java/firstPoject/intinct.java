package firstPoject;

import java.util.Scanner;
//public class inti extends NoSuchFieldException {
//	public inti(String a)
//	{
////		System.out.println("hello");
//		System.out.println(a);
//		
//	}
//}

public class intinct {
	
	 public static void main(String[] args) {
//		 System.out.println("starts");
		 Scanner y=new Scanner(System.in);
		 System.out.println("enter");
		 String u;
		 while(true) {
		 u=y.next();	 
		 if(!u.equals("comeon")) {
			 System.out.println("no exception");
//			 continue;
		 }
		 else {
			 try {
			 throw new exep("hel");
			 }
			 catch(Exception k){
				 System.out.println("handled");
			 }
		 }
		 }
	}
	
}