package guviply;

import java.util.Scanner;

public class ReverseAndRemoveVowel {

	public static void main(String[] args) {
		String s;
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		StringBuffer str=new StringBuffer(s);
		StringBuffer output1=str.reverse();
		char[] t=new char[output1.length()];
		
		for(int i=0;i<s.length();i++){
			t[i]=output1.charAt(i);
			if(t[i]=='a'||t[i]=='e'||t[i]=='i'||t[i]=='o'||t[i]=='u'||t[i]=='A'||t[i]=='E'||t[i]=='I'||t[i]=='O'||t[i]=='U'){
				t[i]='\0';
				
			}
		}String output2=String.valueOf(t);
		output2=output2.replace("\0","");
		System.out.println("Output 1: "+output1);
		System.out.println("Output 2: "+output2);
		in.close();

	}
}

