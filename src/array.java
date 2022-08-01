import java.util.*;

public class array {
    public static void search(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                System.out.println(x + " at index " + i);
                return;
            }
        }
        System.out.println(x + " not found!");
    }

    public static void main(String ak[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The array is ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n" + a.length);
        System.out.println();
        int x = sc.nextInt();
        search(a, x);
        System.out.println("Reversed array");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(" " + a[i]);
        }
    }
}