import java.util.*;

public class functios {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static int sumTwoNo(int a, int b) {
        int sum;
        sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public static void product(int a, int b) {
        int pr = a * b;
        System.out.printf("The product of two no is %d\n", pr);
        return;
    }

    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("invalid number !");
            return;
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        printMyName(name);
        int a, b;
        System.out.println("Enter two numbers to get the sum");
        a = sc.nextInt();
        b = sc.nextInt();
        sumTwoNo(a, b);
        product(a, b);
        System.out.println("Enter the number to calculate factorial");
        int n = sc.nextInt();
        printFactorial(n);

    }

}