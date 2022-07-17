import java.util.Scanner;

public class Q_4 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of kilometer to change in to miles :-");
        float a;
        a = sc.nextFloat();
        float m;
        m = a * 0.62137f;
        System.out.println("The changed value is :- " + m);
    }
}
