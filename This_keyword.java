public class This_keyword {
    int modelYear;
    String modelName;

    public This_keyword(int modelYear,String modelName){
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public static void main(String[] args) {
        This_keyword obj = new This_keyword(100,"honda");
        System.out.println(obj.modelName+" "+obj.modelYear);
    }

}
