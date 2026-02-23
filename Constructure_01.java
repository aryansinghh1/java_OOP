public class Constructure_01 {
    int x;

    public Constructure_01(int y) {
        x = y;
    }

    public static void main(String[] args) {
        Constructure_01 myObj = new Constructure_01(5);
        System.out.println(myObj.x);
    }
}
