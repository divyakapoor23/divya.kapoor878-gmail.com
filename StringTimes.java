/*
* Given a string and a non-negative int n, 
* return a larger string that is n copies of the 
* original string.
* stringTimes("Hi", 2) -> "HiHi"
* stringTimes("Hi", 3) -> "HiHiHi"
* stringTimes("Hi", 1) -> "Hi"
*/
public class StringTimes {
   public static void main(String[] args) {
      String str;
      int n;
      stringTimes("Hi", 2);
   }
   public static String stringTimes(String str, int n) {
      String times = "";
      for(int i = 0; i < n; i++) {
         times = times + str;
      }
      System.out.println(times);
      return times;
   }
}