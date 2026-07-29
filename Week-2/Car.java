public class Car extends Vehicle
{
    String model;

    Car(String brand, String model)
    {
        super(brand);
        this.model = model;
    }

    void displayCar()
    {
        displayVehicle();
        System.out.println("Model: " + model);
    }

    public static void main(String[] args)
    {
        Car car = new Car("Toyota", "Fortuner");

        car.displayCar();
    }
}