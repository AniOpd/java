import java.util.*;

public class pattern_question {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // triangular star pattern
        for (int i = 1; i <= n; i++) {
            System.out.print("\n");
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
        }
        System.out.println("\n");
        // rectangular box star pattern
        for (int i = 1; i < n; i++) {
            System.out.print("\n");
            for (int j = 1; j <= n; j++) {
                System.out.print('*');
            }
        }
        System.out.println("\n");
        // hollow rectangle
        for (int i = 1; i < n; i++) {
            System.out.print("\n");
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println("\n");
        // inverse triangle
        for (int i = 0; i < n; i++) {
            System.out.print("\n");
            for (int j = n; j > i; j--) {
                System.out.print('*');
            }
        }
        System.out.println("\n");
        for (int i = n; i >= 0; i--) {
            System.out.print("\n");
            for (int j = 1; j <= n; j++) {
                if (j > i) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
        }
        // no triangle pattern
        for (int i = 1; i <= n; i++) {
            System.out.print("\n");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        }
        // inverted half peramid with numbers
        for (int i = n; i >= 1; i--) {
            System.out.print("\n");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        }
        // Floyd's triangle
        int k;
        k = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                k += 1;
                System.out.print(k);
            }
        }
        // only 0,1 triangle

        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                } else {
                    System.out.print(j % 2);
                }
            }
        }
        // same problem different approach
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                int sum = i + j;
                System.out.print(sum % 2);
            }
        }
    }
}