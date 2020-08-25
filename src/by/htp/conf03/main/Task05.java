package by.htp.conf03.main;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n");
		n = sc.nextInt();
		int a[] = new int [n];
		for(int i=0; i<n; ++i) {
			a[i]=sc.nextInt();
			
		}
		int min = a[0];
		int max = a[0];
		for(int i=0; i<n; ++i) {
			if(a[i]>max) {
				max = a[i];
			}
			if(a[i]<min) {
				min = a[i];
			}
		}
		int result = max - min;
		System.out.println(result);
		sc.close();
	}
}
