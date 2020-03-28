/*
* Given a string and a non-negative int n, we'll say that 
* the front of the string is the first 3 chars, or whatever 
* is there if the string is less than length 3. Return n 
* copies of the front;
* frontTimes("Chocolate", 2) -> "ChoCho"
* frontTimes("Chocolate", 3) -> "ChoChoCho"
* frontTimes("Abc", 3) -> "AbcAbcAbc"
*/
public class FrontTimes {
   public static void main(String[] args) {
      String str;
      int n;
      frontTimes("Chocolate", 2);
      frontTimes("A", 3);
   }
   public static String frontTimes(String str, int n) {
      String empty = "";
      if (str.length() < 3) {
         for(int i = 0; i < n; i++) {
            empty += str;
         }
      }
      else {
         String front = str.substring(0,3);
         for(int i = 0; i < n; i++) {
            empty += front;
         }
      }
      System.out.println(empty);
      return empty;
   }
}