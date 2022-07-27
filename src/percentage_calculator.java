import java.util.Scanner;

public class percentage_calculator {
    public static void main(String[] arg) {
        System.out.println("Enter the marks of maths");
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        System.out.println("Enter the marks of Science");
        double s = sc.nextDouble();
        System.out.println("Enter the marks of English");
        double E = sc.nextDouble();
        double P = ((m + s + E) / 300) * 100;
        System.out.println("The percentage of the student is :-");
        System.out.println(P);
    }
}
