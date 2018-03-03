package Strings;

public class Trim {

	public static void main(String[] args) {
		String s1="java 456  selenium";
		System.out.println(s1);
		
		System.out.println(s1.indexOf("v"));
		String s2=s1.substring(3, 7);
		System.out.println(s2);
		
		String str1=" ";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ')
				str1=str1+s1.charAt(i);
		}
System.out.println(str1);
	}

}
