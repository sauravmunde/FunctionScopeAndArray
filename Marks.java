import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {

        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy : " + marks[0]);
        System.out.println("math : " + marks[1]);
        System.out.println("chemistry : " + marks[2]);

        // percentage

        System.out.println("percentage = " + (marks[0] + marks[1] + marks[2]) / 3);

        marks[2] = 100;
        System.out.println("marks : " + marks[2]);

    }

}
