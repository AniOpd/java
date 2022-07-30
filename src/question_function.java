import java.util.*;

public class question_function {
    public static void avgfinder(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.out.println(avg);
    }

    public static void oddSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 > 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    public static void greater(int a, int b) {
        if (a > b) {
            System.out.printf("%d is greater\n", a);
        } else if (a == b) {
            System.out.println("both are equal");
        } else {
            System.out.println(b + " is greater");
        }
    }

    public static void circumference(int a) {
        double cir = 2 * 3.14 * a;
        System.out.println(cir);
    }

    public static void voteElegibility(int n) {
        if (n >= 18) {
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Not eligible for vote");
        }
    }

    public static void power(int a, int b) {
        int pow = 1;
        for (int i = 1; i <= b; i++) {
            pow = pow * a;
        }
        System.out.println(pow);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        avgfinder(a, b, c);
        int n = sc.nextInt();
        oddSum(n);
        greater(a, b);
        circumference(n);
        voteElegibility(n);
        power(a, n);
    }
}