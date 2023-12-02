public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 52;
        double height = 1.65;
        int index = service.calculate(weight, height);
        System.out.println(index);
    }
}