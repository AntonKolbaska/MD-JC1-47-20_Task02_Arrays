package by.htp.conf03.main;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n");
		n = sc.nextInt();
		int a[] = new int [n];
		for(int i=0; i<n; ++i) {
			a[i]=sc.nextInt();
			
		}
		int counter;
		counter=0;
		for(int i=0; i<n; ++i) {
			if(a[i]==0) {
				++counter;
			}
		}
		
		
		int arr[] = new int[counter];
		for(int i=0, j=0; i<n; ++i) {
			if(a[i]==0) {
				//System.out.println(i);
				arr[j]=i;
				System.out.println(arr[j]);
				++j;
			}
		}
		sc.close();

	}

}
