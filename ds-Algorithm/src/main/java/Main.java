import java.util.*; 
import java.io.*;

class Main {

  public static String FirstReverse(String str) {
String str2="";
    for (int i = str.length()-1; i>=0; i--) {
      str2+=str.charAt(i);
    }


    return str2;
  }

  public static void main (String[] args) {
      // keep this function call here
      Scanner s = new Scanner(System.in);
      System.out.print(FirstReverse(s.nextLine()));


  }
}