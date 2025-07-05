public class basicsOne {

    public static void func1(int a) {

        System.out.println("a");
    }

    public static void func2(int a, int b) {
        int ans = 1;
        for (int i = 0; i < b; i++) {
            ans *= a;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        func1(5);

        func2(5, 4);

    }

}
