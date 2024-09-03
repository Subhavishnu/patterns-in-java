package pattern;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int a=sc.nextInt();
		for(int i=0;i<a;i++) {
			int odd=2*i+1;
			System.out.println((odd*(odd+1))+" "+(odd+1)+" "+odd);
		}
	}

}
