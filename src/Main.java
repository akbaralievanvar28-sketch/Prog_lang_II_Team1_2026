import java.util.Scanner;

// My moodle course is https://moodle.nye.hu/course/view.php?id=2887
// Enrollment key is 20_Java_26

public class Main {
    public static void main(String[] args) {
        //Literals:
        int number = 42; // Decimal number
        int number2 = 0x42; // Hexadecimal number
        int number3 = 042; // Octal number
        float real_number = 3.14f; // A real float number
        double real_number2 = 3.14; // A real double number
        char letter = '\u263A'; // Unicode character, not ASCII
        boolean bool = true; // Boolean type, true or false
        String sentence = "appletree"; // String is a class, not a primitive type
        System.out.println("Number: " + number);
        System.out.println("Number2: " + number2);
        System.out.println("Number3: " + number3);
        System.out.println("real_number: " + real_number);
        System.out.println("real_number2: " + real_number2);
        System.out.println("Letter: " + letter);
        if (bool) {
            System.out.println("bool is true");
        } else
        {
            System.out.println("bool is false");
        }
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.substring(5));

        //Ask a number from the keyboard:
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        //Use the Scanner object to send data to a variable:
        System.out.print("Enter an integer number: ");
        int number1 = Integer.parseInt(input.nextLine()); //Send a string, then convert to an integer
        System.out.println("number1: " + number1);
        System.out.println("Enter your name:");
        //String name = input.next(); //Send until the first whitespace character
        //input.nextLine(); //An empty input, to free the previous ENTER
        String name = input.nextLine(); //Send until the first ENTER
        System.out.println("your name: " + name);

    }
}