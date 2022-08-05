import java.util.*;

public class Strings {
    public static void pallindrom(String name) {
        int l = (name.length() / 2);
        for (int i = 0; i < l; i++) {
            if (name.charAt(i) != name.charAt(name.length() - 1 - i)) {
                System.out.println("The string is not pellindrom");
                return;
            }
        }
        System.out.println("The string is pallindrom");
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        pallindrom(name);
    }
}