public class X {
    private static int N = 0;

    public X() {
        this(1);
        System.out.println(2);
    }

    public X(int x) {
        System.out.println(x);
        System.out.println(3);
    }

    public static void main() {
        int N = 10;
        System.out.println(N);
        System.out.println(X.N);

        X x = new X();
        X[] d = new X[1];
        d[0] = new X();
    }
}