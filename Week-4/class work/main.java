import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Create a new array:
        int [] myArray = new int [10]; //to allocate 10 integer numbers
        int [] grades = { 2, 3, 2, 5, 3, 3}; //specified current values to store
        System.out.println("Element's number: " + grades.length);
        System.out.println("First element: " + grades[0]);
        System.out.println("Second element: " + grades[1]);
        //System.out.println("Invalid element:" + grades[-1]); //Builtin verification for the index numbers

        int[][] sqrs = {
                { 1, 1 },
                { 2, 4 },
                { 3, 9 },
                { 4, 16 },
                { 5, 25 }
        };
        System.out.println("3 square is: " + sqrs[2][1]);

        //Reference for an array
        int[] nums1 = new int[10];
        int[] nums2 = new int[10];
        for(int i=0; i < 10; i++)
            nums1[i] = i;
        nums2 = nums1; //We will fill the nums2, or it's just a reference to the nums1?
        // now nums2 refers to nums1
        // now operate on nums1 array through nums2
        nums2[3] = 99;
        System.out.print("Here is nums1 after change through nums2: ");
        //    for(int i=0; i < 10; i++)
        //    System.out.print(nums1[i] + " ");

        //foreach loop:
        for(int element : nums1)
            System.out.print(element + " ");

        //Strings:
        String fruit1 = "apricot"; //Simple way
        String fruit2 = new String("apple"); //Constructor call
        System.out.println("Fruit 1: " + fruit1);
        System.out.println("Length of the fruit 1: " + fruit1.length()); //length() method
        System.out.println("First letter: " + fruit1.charAt(0));
        System.out.println("A substring of the fruit1:" + fruit1.substring(3));
        System.out.println("Search a substring in a string: " + fruit2.indexOf("an"));
        System.out.println("Search a substring in a string: " + fruit2.indexOf("age"));

        //Compare two strings
        //if (fruit1 == "apple") System.out.println("Fruit 1 and Fruit 2 are the same"); //Wrong comparison
        if (fruit1.equals("apple")) System.out.println("Fruit 1 is apple");

        //Compare the alphabetical order of two strings:
        System.out.println("Fruit 1 compare to Fruit 2: " + fruit1.compareTo(fruit2)); // > 0 , when the first string come later than the second
        // < 0, when the second string come later
        // = 0, when are the same


        //Builtin sort:
        Arrays.sort(nums1);
        for(int element : nums1)
            System.out.print(element + " ");
        System.out.println();

        String[] fruits = { "cranberry", "blueberry", "apple", "pear"};
        Arrays.sort(fruits);
        for(String fruit : fruits)
            System.out.print(fruit + " ");

        //Random numbers, create a new object (rand)
        Random rand = new Random();
        System.out.println("Random integer number: " + rand.nextInt());
        System.out.println("Random integer number: " + rand.nextInt(2));
        System.out.println("Random integer number: " + rand.nextInt(1, 6));
        System.out.println("Random floating point number: " + rand.nextFloat());

        //Command line arguments
        System.out.println("Command line argument number: " + args.length);
        if (args.length > 0 ) System.out.println("First command line argument: " + args[0]);
        if (args.length > 1) System.out.println("Second command line argument: " + args[1]);
        //Convert to number:
        System.out.println("First argument as a number: " + Integer.parseInt(args[0]));
    }
}