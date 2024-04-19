package firstPoject;

import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class prac{
	public static void main(String[] args) {
		TreeMap<Integer,String> a= new TreeMap<>();
		a.put(1,"key");
		double x=new Integer(20);
		System.out.println(x);
//		System.out.println(t);
		ArrayList<Integer> b= new ArrayList<Integer>();
		b.add(5);
		try {
//		b.add(34.34);
		}
		catch(Exception e) {
			System.out.println("handled");
		}
	}
}
