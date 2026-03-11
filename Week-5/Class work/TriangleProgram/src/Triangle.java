public class Triangle {
    //sides: private data
    //instance variable:
    private double a, b, c;
    //How many triangles we have?
    //STATIC variable:
    private static int instanceCount = 0;

    //Side count: static FINAL value (can't change it)
    public static final int SIDE_COUNT = 3;

    //getter methods to read private data:
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    //Static method for a static variable
    public static int getInstanceCount() {
        return instanceCount;
    }

    //setter methods to change a private data:
    public void setA(double a) {
        //Verify, before change it!
        if (isValid(a, this.b, this.c)) {
            this.a = a;
        }
        else {
            System.out.println("Triangle A is invalid with that 'a' side: " + a);
        }
    }

    public void setB(double b) {
        //Verify, before change it!
        if (isValid(this.a, b, this.c)) {
            this.b = b;
        }
        else {
            System.out.println("Triangle A is invalid with that 'b' side: " + b);
        }
    }

    public void setC(double c) {
        //Verify, before change it!
        if (isValid(this.a, this.b, c)) {
            this.c = c;
        }
        else {
            System.out.println("Triangle A is invalid with that 'c' side: " + c);
        }
    }

    // constructors, full-parameterized
    public Triangle(double a, double b, double c) {
        if (isValid(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("Triangle is not valid");
            a = 3;
            b = 3;
            c = 3;
            System.out.println("We will create a regular triangle");
        }
        instanceCount++;
    }

    //another constructor: a regular triangle
    public Triangle(double a) {
        this.a = a;
        this.b = a;
        this.c = a;
        instanceCount++;
    }

    //default constructor
    public Triangle() {
        a = 3;
        b = 3;
        c = 3;
        instanceCount++;
    }


    //Verification: your triangle is valid?
    boolean isValid(double a, double b, double c) {
        return (a+b > c) && (a+c > b) && (b+c > a) && a > 0 && b > 0 && c > 0;
    }

    //toString: override with an annotation:
    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
