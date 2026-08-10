package com.objectclass;

public class Ex implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {

		Ex ex = new Ex();

		System.out.println(ex.hashCode());
		System.out.println(ex.toString());
		System.out.println(ex.equals(new Object()));
		Ex clone = (Ex) ex.clone();
		System.out.println(clone.equals(ex));
		System.out.println(ex.getClass());
		
		int x=10;
		Integer valueOf = Integer.valueOf(x);
		Integer y=x;
		
		int v=y;
		
		
		String s="90";
		String s1="90";
		System.out.println(Integer.parseInt(s)+Integer.parseInt(s1));
		
		int int1 = Integer.parseInt(s1);
		
		String valueOf2 = String.valueOf(int1);
		
		
		
	}

}
