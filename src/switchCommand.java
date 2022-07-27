import java.util.*;

public class switchCommand {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("press any button");
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("bonjour");
                break;
            default:
                System.out.println("Invalid button");
        }
    }
}