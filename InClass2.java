public class InClass2 {
   public static void main (String[] args) {
      int [] array1 = {11, 12, 13, 14, 15};
      int [] array2 = new int [5];
      int [] array3;
      
      System.out.print("|");
      
      for (int i = 0; i < array2.length; i++) {
         System.out.print(array2[i] + "|");
      }
      
      array3 = changeIt(array1, array2);
      
      System.out.print("\n|");
      
      for (int i = 0; i < array2.length; i++) {
         System.out.print(array2[i] + "|");
      }
      
       System.out.print("\n|");
      
      for (int i = 0; i < array3.length; i++) {
         System.out.print(array3[i] + "|");
      }
   }
   
   static int [] changeIt(int [] values1, int [] values2) {
      int [] values3 = new int[15];
   
      for (int i = 0; i < values2.length; i++) {
         values2 [i] = values1 [i];
      }
      
      return values3;
   }
}