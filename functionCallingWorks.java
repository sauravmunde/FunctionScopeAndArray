public class functionCallingWorks {

    public static int sum(int a, int b) {

        int result = a + b;

        return result;
    }

    public static void main(String[] args) {
        int a = 10;

        int b = 5;

        int result = sum(a, b);

        System.out.println(result);

    }

}