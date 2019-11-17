package com.capgemini.datastructure.sorting;

import java.util.Scanner;

public class QuickSort {
	static int a[];
	static int n;

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter Number of Elements You Want to Insert : ");
		n = read.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("\nEnter no." + (i + 1) + " :");
			a[i] = read.nextInt();
		}
		QuickSort ii = new QuickSort();
		ii.QuickSort(a, 0, n - 1);
		System.out.print("\nAll Elements are :");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	void QuickSort(int a[], int first, int last) {
		int i, j, k, temp;
		if (first < last) {
			i = first;
			j = last + 1;
			k = first;
			do {
				do {
					i++;
				} while (a[i] < a[k]);
				do {
					j--;
				} while (a[j] > a[k]);
				if (i < j) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			} while (i < j);
			temp = a[k];
			a[k] = a[j];
			a[j] = temp;
			QuickSort(a, first, j - 1);
			QuickSort(a, j + 1, last);
		}

	}

}
