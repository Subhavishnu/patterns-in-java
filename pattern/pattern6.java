package pattern;
import java.util.*;
public class pattern6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        for(int i=1;i<=n;i++,System.out.println()) {
        	for(int j=1;j<=i;j++) {
        		System.out.print("* ");
        	}
           k=2*(n-i);
           for(int j=1;j<=k;j++) {
        	   System.out.print("  ");
           }
           for(int j=1;j<=i;j++) {
       		System.out.print("* ");
       	}
        }
        for(int i=n-1;i>=1;i--,System.out.println()) {
        	for(int j=1;j<=i;j++) {
        		System.out.print("* ");
        	}
        	 k=2*(n-i);
             for(int j=1;j<=k;j++) {
          	   System.out.print("  ");
             }
             for(int j=1;j<=i;j++) {
         		System.out.print("* ");
         	}
        }
	}

}
