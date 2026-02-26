import java.util.Calendar;

class BankAccount {
    String owner;
    double balance;

    //Constructor
    public BankAccount(String owner, double balance) {
        owner = owner;
        balance = balance;
    }
}


class Human {
    //Variables
    String name;
    int year_of_birth;
    //Method
    int getAge() {
        int current_year = Calendar.getInstance().get(Calendar.YEAR);
        return current_year - year_of_birth;
    }

    //Constructor, a full specialized
    public Human(String name, int year_of_birth) {
        this.name = name;
        this.year_of_birth = year_of_birth;
    }
}

public class Main {

    //A method to create a pattern from a character
    public static void printRow(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
        //A new line after that
        System.out.println();
    }

    //Overload the previous method: polymorphism
    public static void printRow(int n) {
        printRow(n, '-');
    }

    //Overload the method
    public static void printRow(char c, int n) {
        printRow(n, c);
    }

    public static void main(String[] args) {
        //Create a new human object:
        Human mary = new Human("Mary Jane", 2007); //Create and allocate a new human in the memory
        //mary.name = "Mary Jane"; //Specify a data for the first object
        //mary.year_of_birth = 2007;
        System.out.println("Mary name: " + mary.name + ", year of birth: " + mary.year_of_birth);
        //Create another human ovject:
        Human peter =  new Human("Peter Parker", 2006);
        //peter.name = "Peter Parker";
        //peter.year_of_birth = 2006;
        System.out.println("Peter name: " + peter.name + ", year of birth: " + peter.year_of_birth);

        Human clone = peter; //It's a new object, or just a reference to a previously created human? It's a reference
        System.out.println("Clone name: " + clone.name + ", year of birth: " + clone.year_of_birth);
        //Change the name of the clone:
        clone.name = "Spiderman";
        //Print Peter's name:
        System.out.println("Peter name: " + peter.name + ", year of birth: " + peter.year_of_birth);
        //Erase an object
        System.out.println("mary = null");
        mary = null;
        //System.out.println("Mary name: " + mary.name + ", year of birth: " + mary.year_of_birth); //please don't use, because it's nulled
        //Erase peter:
        peter = null;
        System.out.println("peter = null");
        //Access to the original object through the clone:
        System.out.println("Clone name: " + clone.name + ", year of birth: " + clone.year_of_birth);
        System.out.println("Age of the clone: " + clone.getAge());

        //Print a pattern:
        printRow(20, '*');
        printRow(10, 'x');
        //Use another method:
        printRow(15);
        printRow('A',  10); //Wrong order of the arguments, but if you create another method for that..

        //Use the BankAccount class
        BankAccount myAccount = new BankAccount("John Smith", 1000);
        System.out.println("Smiths account: " + myAccount.owner + ", " + myAccount.balance);


        //An array:
        double grades[] = { 2, 3, 2, 4, 5, 3};
        System.out.println("First element: " + grades[0]);
        System.out.println("Second element: " + grades[1]);
        //Create a loop:
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
        }
    }
}
