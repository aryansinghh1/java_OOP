interface Greeting{
    void sayHello();
}
public class Anonymous_class_01 {
    public static void main(String[] args) {
        Greeting greet = new Greeting() {
            public void sayHello(){
                System.out.println("Hello, World!");
            }
        };
        greet.sayHello();
    }
}
