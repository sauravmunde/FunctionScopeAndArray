
public class fahrenheit {

    public static void printFahrenheitTable(int S, int E, int W) {

        for (int fahrenheit = S; fahrenheit <= E; fahrenheit += W) {
            int celsius = (int) ((5.0 / 9.0) * (fahrenheit - 32));
            System.out.println(fahrenheit + "\t" + celsius);
        }

    }

    public static void main(String[] args) {
        int a = 0;
        int b = 100;
        int c = 20;
        printFahrenheitTable(a, b, c);
    }

}