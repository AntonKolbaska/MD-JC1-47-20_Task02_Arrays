package by.htp.conf03.main;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n");
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			
		}
		boolean result=true;
		boolean check=true;
		for(int i=1; i<n; ++i) {
			if(a[i]!=a[i-1]) {
				check=false;
			}
			if(a[i]<a[i-1]) {
				result = false;
			}
		}
		if(result && !check) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		sc.close();
	}
}
