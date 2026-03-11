/*public class Test {
    void noChange(int a, int b){
        int c = a;
        a = b;
        b = c;
    }
}*/
 public class Test {
     int a, b;
     public Test(int a, int b) {
         this.a = a;
         this.b = b;
     }
     void Change(Test newTest) {
         int c = newTest.a;
         newTest.a = newTest.b;
         newTest.b = c;
     }
}