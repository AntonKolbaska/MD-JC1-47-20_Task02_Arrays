package by.htp.conf03.main;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n");
		n = sc.nextInt();
		while(n%2!=0) {
			System.out.println("Wrong n, try again:");
			n = sc.nextInt();
		}
		int a[] = new int [n];
		for(int i=0; i<n; ++i) {
			a[i]=sc.nextInt();
			
		}
		int max = a[0] + a[n-1];
		for(int i=0; i<n/2; ++i) {
			if(a[i] + a[n-i-1]>max) {
				max = a[i] + a[n-i-1];
			}
		}
		System.out.println(max);
		sc.close();

	}

}
