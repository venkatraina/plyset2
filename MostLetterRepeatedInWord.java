package guvi;

import java.util.Scanner;

public class MostLetterRepeatedInWord {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int count;
		
		String[] ar=s.split("\\s");
		int[] cnt=new int[ar.length];
		for(int i=0;i<ar.length;i++){
			count=0;for(int h=0;h<ar[i].length();h++){
			for(int j=ar[i].length()-1;j>=1;j--){
				if((ar[i].toLowerCase()).charAt(h)==(ar[i].toLowerCase()).charAt(j)){
					count++;
				}
			}
			}if(count>cnt[i]){
				cnt[i]=count;
			}
		}int max=cnt[0];
		int k=0;
		for(int i=0;i<cnt.length;i++){
			if(max<cnt[i]){
				max=cnt[i];
				k=i;
			}
			
		}System.out.println("Greater letter reputation in the word is : "+ar[k]);
		in.close();


	}

}
