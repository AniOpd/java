import java.util.*;

public class Md_2dArray {
    public static void main(String agr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of colums");
        int n = sc.nextInt();
        System.out.println("Enter the numbers of rows");
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
    }
}
