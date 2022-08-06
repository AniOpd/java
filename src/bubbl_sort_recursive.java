public class bubbl_sort_recursive {
    public static void bubble_sort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (a[i] >= a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
            bubble_sort(a, n - 1);
        }
    }

    public static void main(String arg[]) {
        int[] a = { 52, 23, 62, 45, 15, 48, 56, 32, 45 };
        int n = a.length;
        bubble_sort(a, n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}