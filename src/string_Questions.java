import java.util.Scanner;

public class string_Questions {
    public static void main(String ak[]) {
        System.out.println("Question 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string want to convert");
        String st = sc.nextLine();
        System.out.printf("The lowercae string is %s \n", st.toLowerCase());
        System.out.println("Question 2");
        System.out.println("Enter the string to convert");
        String sst = sc.nextLine();
        System.out.printf("The final string is %s\n", sst.replace(" ", "_"));
        System.out.println("Question 3");
        System.out.println("Dear _____ Thank you ... Fill this letter");
        String ns = sc.nextLine();
        System.out.printf("Dear %s \" Thank you\"\n", ns);
        System.out.printf("Dear %s \" Thank you \"\n", ns.replace("Akki", "ak"));
        System.out.println("Question 4");
        System.out.println(ns.indexOf("  "));
        String name = "Hello Akki \n\t Thank you for joining \n come to me";
        System.out.println(name);
    }
}