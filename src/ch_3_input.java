import java.util.Scanner;
public class ch_3_input {
    public static void  main(String[] arg){
       Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println(str);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        System.out.println("The number is "+a);
        System.out.println("Another number");
        boolean b1= sc.hasNextInt();
        System.out.println(b1);

    }
}
