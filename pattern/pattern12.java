package pattern;
import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++,System.out.println()) {
    	for(int j=i;j<n;j++) {
    		System.out.print(" ");
    	}
    for(int j=n;j<=n;j++) {
    	System.out.print("*");
    }
    for(int j=2;j<=n*2-1;j++) {
    	j++;
    	if(j==i*2-1||i==n) {
    		System.out.print("*");
    	}else {
    		System.out.print(" ");
    	}
    }
    }
	}

}