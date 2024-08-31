public class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String brand, String model, int year, int mileage, int loadCapacity) {
        super(brand, model, year, mileage);
        this.loadCapacity = loadCapacity;
    }


    @Override
    public String rentVehicle(){
        return showDetails() + " " + "Capacidad de Carga:" + loadCapacity + " " + "Rentado";
    }

    @Override
    public String returnVehicle(){
        return showDetails() + " " + "Capacidad de Carga:" + loadCapacity + " " + "Devuelto";
    }
}
