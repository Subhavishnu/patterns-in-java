package pattern;
import java.util.*;
public class pattrn9 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--) {
        	for(int j=i-1;j>=1;j--) {
        		System.out.print(" ");
        	}
        	for(int j=i;j<=n;j++) {
        		System.out.print("*");
        	}
        	for(int j=n;j>i;j--) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
