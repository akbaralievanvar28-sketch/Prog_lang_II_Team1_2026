public class Main {
     public static void main(String[] args) {
        Triangle myTriangle1 = new Triangle(4, 5, 6);
        Triangle myTriangle2 = new Triangle();
        Triangle myTriangle3 = new Triangle(10);
        System.out.println("My triangle 1 is " + myTriangle1.toString());
        //Change the triangle:
        //myTriangle1.a = -100; //not a valid value
         myTriangle1.setA(-100);
         System.out.println("My triangle 1 a side: " + myTriangle1.getA());

         System.out.println("My triangle 1 is " + myTriangle1.toString());

         //change the count number (don't access it!)
         //Triangle.instanceCount = 10;
         System.out.println("My triangle numbers is: " + Triangle.getInstanceCount());

         //Triangle.SIDE_COUNT = 4;
         //Side count:
         System.out.println("How many sides we have: " + Triangle.SIDE_COUNT);
         //passing parameters:
         //Test myTest1 = new Test();
         Test myTest1 = new Test(10,20);
         //int a = 10, b = 20;
         System.out.println("a and b before call: " + myTest1.a + " " + myTest1.b);
         //myTest1.noChange(a, b);
         myTest1.Change(myTest1);
         System.out.println("a and b after call: " + myTest1.a + " "  + myTest1.b);

     }
}