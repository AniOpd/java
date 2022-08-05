
public class sorting {
    public static void sort(int a[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] >= a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }
        }
    }

    public static void main(String ak[]) {
        int a[] = { 2, 1, 0, 2, 1, 1, 2, 0, 2, 1, 2, 1, 0 };
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int n = a.length;
        sort(a, n);
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }
}