package guvi;

import java.util.Scanner;

public class MultipcationOfNumberAsAString {

	public static void main(String[] args) {
		String n1;
		String n2;
		Scanner in=new Scanner(System.in);
		n1=in.next();
		n2=in.next();
		int pro=Integer.parseInt(n1)*Integer.parseInt(n2);
		String result=String.valueOf(pro);
		System.out.println(result);
		in.close();

	}

}
