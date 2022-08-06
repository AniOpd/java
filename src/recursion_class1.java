public class recursion_class1 {
    public static void number(int n) {

        if (n > 0) {
            System.out.print(" " + n);
        } else {
            return;
        }
        number(n - 1);
    }

    public static void sumn(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sumn(i + 1, n, sum);
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int factorialnm = factorial(n - 1);
        int fact = n * factorialnm;
        return fact;
    }

    public static void printfib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printfib(b, c, n - 1);
    }

    public static int clacpow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int pownm = clacpow(x, n - 1);
        int pow = x * pownm;
        return pow;
    }

    // optimized solution for pow calc
    public static int calcpow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return calcpow(x, n / 2) * calcpow(x, n / 2);
        }
        if (n % 2 != 0) {
            return clacpow(x, n / 2) * calcpow(x, n / 2) * x;
        }
        return calcpow(x, n);
    }

    public static void main(String arg[]) {
        int n = 8;
        number(n);
        System.out.println();
        sumn(1, n, 0);
        System.out.println(factorial(n));
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        printfib(a, b, n - 2);
        int x = 2;
        System.out.println(clacpow(x, n));
        System.out.println(calcpow(x, n));
    }
}