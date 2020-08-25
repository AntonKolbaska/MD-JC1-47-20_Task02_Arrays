package by.htp.conf03.main;
import java.util.Scanner;
public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n");
		n = sc.nextInt();
		int a[] = new int [n];
		for(int i=0; i<n; ++i) {
			a[i]=sc.nextInt();
			while(a[i]<1) {
				System.out.println("not a natural number, try again");
				a[i]=sc.nextInt();
			}
		}
		int k;
		System.out.println("Enter k");
		k = sc.nextInt();
		int result;
		result =0;
		for(int i=0; i<n; ++i) {
			if(a[i]%k==0) {
				result+=a[i];
			}
		}
		System.out.println(result);
		sc.close();
	}

}
