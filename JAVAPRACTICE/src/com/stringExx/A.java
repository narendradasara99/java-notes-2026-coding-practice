package com.stringExx;

public class A {

	public static void main(String[] args) {
		String x = "1000";
		int int1 = Integer.parseInt(x);
		Integer valueOf = Integer.valueOf(int1);
		int intValue = valueOf.intValue();
		String v = String.valueOf(intValue);
		//string reverse
		String string = new StringBuilder(v).reverse().toString();
		System.out.println(string);

		String rev = "";

		for (int i = v.length() - 1; i >= 0; i--) {
			rev = rev + v.charAt(i);

		}
		System.out.println(rev);
		
		//count vowels in string
		
		String s="narendra";
		
		System.out.println(s.indexOf("e"));
		
		
		char[] charArray = s.toCharArray();
		for(char c:charArray) {
			if("aeiouAEIOU".indexOf(c)!=-1) {
				System.out.println(c);
			}
		}
		
		//find the first occurence 
		System.out.println(s.indexOf("r"));
		//check if char exist
		if(s.indexOf('d')!=-1) {
			System.out.println("d is there");
		}
		
		
		// count occurences of character
		
		int indexOf = s.indexOf('n');
		int c=0;
		
		while(indexOf!=-1) {
			c++;
			indexOf=s.indexOf('n',indexOf+1);
			
		}
		System.out.println(c);
		
		//remove duplicates

		
		String	du="";
		
		
		for(char u:s.toCharArray()) {
			
			if(du.indexOf(u)==-1) {
				du=du+u;
			}
			
		}

		System.out.println(du);

	}
	

}
