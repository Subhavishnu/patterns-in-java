package pattern;
import java.util.*;
public class pattern5 {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();;
         char ch='A';
         for(int i=1;i<=n;i++,System.out.println()) {
        	 for(int j=n;j>i;j--) {
        		 System.out.print(" ");
        	 }
        	 ch='A';
        	 for(int j=1;j<=i;j++) {
        		 System.out.print(ch);
        		 ch++;
        	 }
        	 for(int j=2;j<=i;j++) {
        		 System.out.print(ch);
        		 ch++;
        	 }
         }
         for(int i=n-1;i>=1;i--,System.out.println()) {
        	 for(int j=n;j>i;j--) {
        		 System.out.print(" ");
        	 }
        	 ch='A';
        	 for(int j=1;j<=i;j++) {
        		 System.out.print(ch);
        		 ch++;
        	 }
        	 for(int j=2;j<=i;j++) {
        		 System.out.print(ch);
        		 ch++;
        	 }
         }
	}

}
