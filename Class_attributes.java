public class Class_attributes {
    String fname= "Aryan";
    String lname= "Singh";
    int x = 5;

    public static void main(String[] args) {
        Class_attributes myObj1 = new Class_attributes(); // Object 1
        Class_attributes myObj2 = new Class_attributes(); // Object 2
        myObj2.x = 25;
        System.out.println(myObj1.x); // Outputs 5
        System.out.println(myObj2.x); // Outputs 25
        System.out.println(myObj1.fname+" "+ myObj1.lname);
    }
}
