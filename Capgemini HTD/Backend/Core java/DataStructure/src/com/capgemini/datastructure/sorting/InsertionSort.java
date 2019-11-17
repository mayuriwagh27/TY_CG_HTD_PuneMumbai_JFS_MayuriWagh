package com.capgemini.datastructure.sorting;

import java.util.Scanner;

public class InsertionSort {
	static int a[];
	static int n;

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter Number of Elements you want to Insert : ");
		n = read.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("\nEnter no. " + (i + 1) + " ");
			a[i] = read.nextInt();
		}
		InsertionSort ii = new InsertionSort();
		ii.insertionsort(a, n);
		System.out.print("\nAll Elements are :");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	void insertionsort(int a[], int n) {
		int i, j, item;
		for (j = 1; j < n; j++) {
			item = a[j];
			for (i = j - 1; i >= 0 && item < a[i]; i--)
				a[i + 1] = a[i];
			a[i + 1] = item;
		}
	}

}
