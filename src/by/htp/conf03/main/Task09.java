package by.htp.conf03.main;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n");
		n = sc.nextInt();
		int a[] = new int [n];
		for(int i=0; i<n; ++i) {
			a[i]=sc.nextInt();
			
		}
		int negative = 0;
		int positive = 0;
		int zero = 0;
		for(int i=0; i<n; ++i) {
			if(a[i]==0) {
				++zero;
			}
			if(a[i]<0) {
				++negative;
			}
			if(a[i]>0) {
				++positive;
			}
		}
		System.out.println("negative: " + negative + "\nzero: " + zero + "\npositive: " + positive);
		sc.close();
	}

}
