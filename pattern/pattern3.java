package pattern;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int a=sc.nextInt();
		System.out.println("Enter the no of columns:");
		int b=sc.nextInt();
		int num=a*b;
    for(int i=0;i<a;i++) {
    	if(i%2==0) {
    	for(int j=0;j<b;j++) {
    		System.out.print((num--)+" ");
    	}
    	}
    	else {
    		num=num-a+1;
    		for(int j=0;j<b;j++) {
    			System.out.print((num++)+" ");
    		}num=num-a-1;
    	}
    	System.out.println();
    }
    sc.close();  
	}

}
