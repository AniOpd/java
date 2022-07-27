import java.util.*;

public class conditional {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter the age to check elegiblity to vote");
        age = sc.nextInt();
        if (age >= 18) {
            System.out.printf("You are eligible for vote\n");
        } else {
            System.out.printf("you are not eligible for vote");
        }
        System.out.println("Enter the no to check odd or even");
        int no = sc.nextInt();
        if (no % 2 != 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
        System.out.println("Enter to numbers to check equality");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (a == b) {
            System.out.println("equal");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }
        System.out.println("Enter command");
        int command = sc.nextInt();
        if (command == 1) {
            System.out.println("hello");
        } else if (command == 2) {
            System.out.println("namaste");
        } else if (command == 3) {
            System.out.println("bonjor");
        } else {
            System.out.println("invalid command");
        }
    }
}