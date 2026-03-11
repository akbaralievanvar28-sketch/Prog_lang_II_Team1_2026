public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 22);
        Student s3 = new Student();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        Student.printStudentCount();

        System.out.println();
        CoffeeMachine myMachine = new CoffeeMachine("WW", 250, 500);
        System.out.println(myMachine);
        myMachine.setPrice(-100);
        System.out.println("Price: $" + myMachine.getPrice());
        myMachine.makeCoffee();
        myMachine.addWater(500);
        myMachine.makeCoffee();
    }
}
