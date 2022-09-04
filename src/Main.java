public class Main {

    public static void main(String[] args) {
        Car sportCar = new SportCar(new BasicCar());
        sportCar.assemble();
        Car LuxurySportCar = new LuxuryCar(new SportCar(new BasicCar()));
        LuxurySportCar.assemble();
    }

}
