//In the example above, java.util is a package, 
//while Scanner is a class of the java.util package.

import java.util.Scanner;
public class package_01 {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter your name: ");

    String name = myObj.nextLine();
    System.out.println(name);
  }
}
