public class pow {
    public static void main(String ak[]) {
        int n = 10;
        double x = 2;
        double pow = 1;
        int i = 0;
        if (n < 0) {
            for (i = 0; i > -n; i--) {
                pow = (1 / x) * (1 / x);
            }
        } else {
            for (i = 0; i < n; i++) {
                pow = pow * x;
            }
        }
        System.out.println(pow);

    }
}