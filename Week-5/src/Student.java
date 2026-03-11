public class Student {
    private String name;
    private int age;
    private static int studentCount = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentCount++;
    }

    public Student() {
        this.name = "Anvar";
        this.age = 18;
        studentCount++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void printStudentCount() {
        System.out.println("Total students created: " + studentCount);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}



