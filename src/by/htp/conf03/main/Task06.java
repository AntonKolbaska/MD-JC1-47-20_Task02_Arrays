package by.htp.conf03.main;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n");
		n = sc.nextInt();
		int a[] = new int [n];
		for(int i=0; i<n; ++i) {
			a[i]=sc.nextInt();
		}
		int z;
		System.out.println("Enter z");
		z = sc.nextInt();
		int result;
		result =0;
		for(int i=0; i<n; ++i) {
			if(a[i]>z) {
				++result;
				a[i]=z;
			}
			System.out.println(a[i]);
		}
		
		System.out.println("Number of changres: " + result);
		sc.close();
	}

}
