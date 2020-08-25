package by.htp.conf03.main;

import java.util.Scanner;

public class Task07 {

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
		int minPosition=0;
		int max = a[0];
		int maxPosition = 0;
		for(int i=0; i<n; ++i) {
			if(a[i]>max) {
				max = a[i];
				maxPosition = i;
			}
			if(a[i]<min) {
				min = a[i];
				minPosition = i;
			}
		}
		int temp;
		temp = a[maxPosition];
		a[maxPosition] = a[minPosition];
		a[minPosition] = temp;
		for(int i=0; i<n; ++i) {
			System.out.println(a[i]);
		}
		sc.close(); 
	}

}
