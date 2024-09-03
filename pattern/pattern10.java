package pattern;
import java.util.*;
public class pattern10 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++,System.out.println()) {
    	for(int j=i;j<n;j++) {
    		System.out.print(" ");
    	}
    for(int j=5;j<=n;j++) {
    	System.out.print("*");
    }
    for(int j=1;j<=n*2;j++) {
    	System.out.print("*");
    }
    }
	}

}
