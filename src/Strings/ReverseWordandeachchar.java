package Strings;

public class ReverseWordandeachchar {

	public static void main(String[] args) {
	 String str="I love java 456 selenium";
	String res=" ";
	String str3="";
	 //int i=0;
	 for(int i=0;i<str.length();i++)
	 {
		 str3=str.charAt(i)+str3;
	 }
    System.out.println(str3);
	 
	 for(int i=0;i<str.length();i++)
	 {
		 String str2="";
		 while(i<str.length()&& str.charAt(i)!=' ')
		 {
			 str2=str2+str.charAt(i);
			 i++;
		 }
		 res=str2+res+" ";
		 
	 }
	 System.out.println(res); 
	 }
	}


