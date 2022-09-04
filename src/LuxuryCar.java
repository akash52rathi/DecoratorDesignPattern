public class LuxuryCar extends DecoratorCar {


    public LuxuryCar (Car car)
    {
        super(car);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Assemple Luxury Car");
    }
}
