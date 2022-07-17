import java.util.Scanner;
public class prosblem_set_1 {
    public static void main(String[] arg){
        //program to sum three numbers
        System.out.println("Enter three numbers");
        Scanner sc =new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int sum;
        sum=a+b+c;
        System.out.println("The sum of three numbers is :-");
        System.out.println(sum);
        //Cgpa calculator
        System.out.println("Enter the numbers of three subjects");
        float q,w,r;
        q=sc.nextFloat();
        w=sc.nextFloat();
        r=sc.nextFloat();
        float p=((q+w+r)/300)*10f;
        System.out.println("The cgpa of the student is :-");
        System.out.println(p);

    }
}
