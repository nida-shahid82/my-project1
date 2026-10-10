import java.util.Scanner;

public class ArrayScenario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] marks = new int[5];

        // Input marks of 5 students
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        // Display all marks
        System.out.println("\nStudent Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        // Find highest marks
        int highest = marks[0];

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        System.out.println("Highest Marks: " + highest);

        input.close();
    }
}