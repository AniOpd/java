import java.util.*;

public class loopStatement {
    public static void main(String arg[]) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Hello world");
            System.out.println(i);
            sum += i;
            System.out.println(sum);
        }
        System.out.println(sum);
        int i = 1;
        while (i < n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("\n");
        do {
            System.out.print(i + " ");
            i++;
        } while (i < n);
    }
}