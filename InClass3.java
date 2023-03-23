import java.util.Scanner;

public class InClass3 {
   public static void main(String[] args) {
   
   MyStuff stuff1 = new MyStuff();
   
   MyStuff stuff2 = new MyStuff(47.5);
   
   System.out.println("Object 1 " + stuff1.calcAvg());
   System.out.println("Object 2 " + stuff2.calcAvg());
   System.out.println("Here is the result " + stuff2.result);
   }
}