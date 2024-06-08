public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.89F;
        double weight = 110.6F;
        int index = service.calculate(weight, height);
        System.out.println("Ваш bmi-индекс: " + index);
    }

}