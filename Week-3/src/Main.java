class Car {

    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Exercise 1:");
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    void startEngine() {
        System.out.println("The car is starting!");
    }

    void stopEngine() {
        System.out.println("The car is stopping!");
        System.out.println("__________________________");
    }
}

class Student {
    String name;
    double[] grades;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    double calculateAverage() {
        if (grades.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020);
        myCar.displayInfo();
        myCar.startEngine();
        myCar.stopEngine();

        System.out.println();

        double[] studentGrades = {4.5, 3.0, 5.0, 4.0};
        Student student = new Student("Anna", studentGrades);
        double avg = student.calculateAverage();
        System.out.println("Exercise 2:");
        System.out.println("Student: " + student.name);
        System.out.println("Average grade: " + avg);
        System.out.println("__________________________");
    }
}