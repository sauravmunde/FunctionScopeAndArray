public class FibonacciMember {

    public static boolean checkMember(int n) {

        int a = 0;
        int b = 1;
        int c;
        while (a < n) {
            c = a + b;
            a = b;
            b = c;
        }
        if (a == n) {
            return true;
        } else {

            return false;
        }
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(checkMember(n));
    }
}
