package pattern;
import java.util.*;
public class pattern4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int val=-1;
	for(int i=1;i<=n;i++,System.out.println()) {
		for(int j=n;j>i;j--) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		for(int j=2;j<=i;j++) {
			System.out.print("*");
		}
		val+=2;
	}
	for(int i=1;i<=3;i++,System.out.println()) {
		for(int j=1;j<=3;j++) {
			System.out.print("*");
		}
		for(int j=1;j<=val-6;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=3;j++) {
			System.out.print("*");
		}
	}
	}
}
