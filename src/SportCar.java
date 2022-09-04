public class SportCar extends DecoratorCar {

    public SportCar(Car car)
    {
        super(car);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Feature of sport Car");
    }
}
