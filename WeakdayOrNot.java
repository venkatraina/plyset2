package player_Set2;

import java.util.Scanner;

public class WeakdayOrNot {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		if((s.toLowerCase()).equals("monday")||(s.toLowerCase()).equals("tuesday")||(s.toLowerCase()).equals("wednesday")||(s.toLowerCase()).equals("thursday")||(s.toLowerCase()).equals("friday")){
			System.out.println("True");
		}else if((s.toLowerCase()).equals("saturday")||(s.toLowerCase()).equals("sunday")){
			System.out.println("False");
		}else{
			System.out.println("Enter valid day");
		}in.close();

	}

}
