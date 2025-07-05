public class basicsfour {

    public static int func(int a) {

        a += 10;

        return a;
    }

    public static int square(int a) {
        int ans = a * a;
        return ans;
    }

    public static void func2(int a) {
        int b = a;
        b = b + 10;
    }

    public static void functhree(int a) {
        int b = 10;
        a = a + 10;
        System.out.println(a);
    }

    public static void main(String[] args) {

        int a = 5;

        func(a);

        System.out.println(func(a));

        System.out.println(a);

        System.out.println(square(a));

        // int l = 10;

        func2(a);

        // func three

        a = 10;
        a = a + 10;
        System.out.println(a);

    }

}
