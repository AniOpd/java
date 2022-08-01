import java.util.*;

public class practiceQuestionArray {
    public static void search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println(x + " is at index " + i);
                return;
            }
        }
        System.out.println(x + " Not found!");
    }

    public static void reverser(String[] arr) {
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        for (int i = 0; i <= n; i++) {
            String a = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = a;
        }
    }

    public static void sorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Array is not sorted");
                return;
            }
        }
        System.out.println("Array is sorted");

    }

    public static void max(int[] a) {
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            if (x < a[i]) {
                x = a[i];
            }
        }
        System.out.println("The maximum of array is " + x);
    }

    public static void min(int[] a) {
        int x = a[0];
        for (int i = 0; i < a.length; i++) {
            if (x > a[i]) {
                x = a[i];
            }
        }
        System.out.println("The min of array is " + x);
    }

    public static void main(String ak[]) {
        Scanner sc = new Scanner(System.in);
        // Q1
        float[] a = { 2.30f, 63.0f, 63.23f, 362.00f, 63.024f };
        float sum = 0f;
        for (int i = 0; i < 5; i++) {
            sum = sum + a[i];
        }
        System.out.println("The sum is : " + sum);
        // q2
        int[] ar = { 36, 10, 2, 15, 24, 2, 25, 30, 15, 20, 42, 52, 15, 25, 15, 45, 36, 85, 9, 65, 45 };
        System.out.println("Enter the value to find in array a");
        int x = sc.nextInt();
        search(ar, x);
        System.out.println("Checking array is sorted or not");
        sorted(ar);
        max(ar);
        min(ar);
        // q3 add 2 matrix
        int[][] matrix1 = new int[2][3];
        int[][] matrix2 = new int[2][3];
        System.out.println("enter elements in matrix 1");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter elements in matrix 2");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix befor adding");
        System.out.println("matrix 1");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matrix1[i][j]);
            }
            System.out.println();
        }
        System.out.println("matrix 2");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matrix2[i][j]);
            }
            System.out.println();
        }
        int[][] matrix3 = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("After adding matrix1 and matrix2 we get new matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matrix3[i][j]);
            }
            System.out.println();
        }
        // q4 reversing an array
        String[] akt = new String[5];
        for (int i = 0; i < 5; i++) {
            akt[i] = sc.next();
        }
        System.out.println("The array is ");
        for (int i = 0; i < 5; i++) {
            System.out.print(akt[i] + " ");
        }
        System.out.println();
        reverser(akt);

        System.out.println("The reversed array is ");
        for (int i = 0; i < 5; i++) {
            System.out.print(akt[i] + " ");
        }

    }
}