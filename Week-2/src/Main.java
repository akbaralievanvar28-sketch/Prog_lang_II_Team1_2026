import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1

        System.out.print("Temperature: ");
        int temp = scanner.nextInt();

        if (temp < 0)
            System.out.println("Below_freezing");
        if (temp >= 0 && temp < 30)
            System.out.println("Average");
        if (temp >= 30)
            System.out.println("Too hot");

        // Task 2

        int sec;
        do {
            System.out.print("Seconds_after_lightning: ");
            sec = scanner.nextInt();
        } while (sec < 0);

        System.out.println("Distance: " + (sec * 300) + " meters");

        // Task 3

        int age;
        do {
            System.out.print("How old are you?(between 1-20): ");
            age = scanner.nextInt();
        } while (age < 1 || age > 20);

        // Draw cake
        for (int i = 0; i < age; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int i = 0; i < age; i++) {
            System.out.print("| ");
        }
        System.out.println();

        for (int i = 0; i < age; i++) {
            System.out.print("--");
        }
        System.out.println();

        System.out.print("_____END_PROGRAM____");


        scanner.close();
    }
}