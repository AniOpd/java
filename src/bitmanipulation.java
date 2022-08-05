public class bitmanipulation {
    static int set(int n, int p) {
        int bitmask = 1 << p;
        n = (bitmask | n);
        return n;
    }

    static int clear(int n, int p) {
        int bitmask = 1 << p;
        n = (~bitmask) & n;
        return n;
    }

    static int get(int n, int p) {
        int bitmask = 1 << p;
        if ((bitmask & n) == 0) {
            return 0;
        }
        return 1;

    }

    static int update(int n, int p) {
        int k = get(n, p);
        if (k == 0) {
            n = set(n, p);
        } else {
            n = clear(n, p);
        }
        return n;
    }

    public static void main(String arg[]) {
        int N = 15;
        int p = 0;

        System.out.println(N);
        N = update(N, p);
        System.out.println(N);
    }
}