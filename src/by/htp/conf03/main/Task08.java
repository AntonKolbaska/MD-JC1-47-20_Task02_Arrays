package by.htp.conf03.main;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n");
		n = sc.nextInt();
		int a[] = new int [n];
		for(int i=0; i<n; ++i) {
			a[i]=sc.nextInt();
			
		}
		for(int i=0; i<n; ++i) {
			if(a[i]>i) {
				System.out.println("a[" + i + "] = " + a[i]);
			}
		}
		sc.close();

	}

}
