public class CreateArray {

    public static void main(String[] args) {

        // creation of the array

        System.out.println();

        int marks[] = new int[5];

        marks[0] = 10;
        marks[1] = 11;
        marks[2] = 12;
        marks[3] = 13;
        marks[4] = 14;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4] + "\n");

        // input of the array

        int numbers[] = { 1, 2, 3, 4 };

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3] + "\n");

        // output off the array

        int moreNumbers[] = { 4, 5, 6 };

        System.out.println(moreNumbers[0]);
        System.out.println(moreNumbers[1]);
        System.out.println(moreNumbers[2] + "\n");

        // string of the array

        String fruits[] = { "apple", "mango", "orange" };

        System.out.println(fruits[0]);

        System.out.println(fruits[1]);

        System.out.println(fruits[2] + "\n");

    }

}