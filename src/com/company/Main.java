package com.company;

import java.util.Scanner;

public class Main {

    public static int[] creatArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void showArray(int arr[]) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = creatArray();
        System.out.print("Mảng vừa nhập là: ");
        showArray(arr1);
        System.out.println();
        int arr2[] = creatArray();
        System.out.print("Mảng vừa nhập là: ");
        showArray(arr2);
        int arr3[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int j = 0; j < arr2.length; j++) {
            arr3[arr1.length + j] = arr2[j];
        }

        System.out.println();
        System.out.print("Gộp arr1 và arr2: ");
        showArray(arr3);

    }
}
