public class DecoratorCar implements Car{

    private Car car;
    public DecoratorCar(Car car)
    {
        this.car=car;

    }
    @Override
    public void assemble() {

        this.car.assemble();
    }
}
