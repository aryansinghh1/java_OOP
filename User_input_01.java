import java.util.Scanner;

public class User_input_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name");
        String name = sc.nextLine();
        System.out.println(name);
    }

}

// Method	Description
// nextBoolean()	Reads a boolean value from the user
// nextByte()	Reads a byte value from the user
// nextDouble()	Reads a double value from the user
// nextFloat()	Reads a float value from the user
// nextInt()	Reads a int value from the user
// nextLine()	Reads a String value from the user
// nextLong()	Reads a long value from the user
// nextShort()	Reads a short value from the user