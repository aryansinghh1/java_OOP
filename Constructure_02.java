public class Constructure_02 {
    int modelYear;
    String modelName;

  public Constructure_02(int year, String name) {
    modelYear = year;
    modelName = name;
  }

    public static void main(String[] args) {
        Constructure_02 myCar = new Constructure_02(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
