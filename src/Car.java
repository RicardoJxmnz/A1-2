public class Car extends Vehicle{

    private int numberDoors;

    public Car(String brand, String model, int year, int mileage, int numberDoors) {
        super(brand, model, year, mileage);
        this.numberDoors = numberDoors;
    }

    @Override
    public String rentVehicle(){
        return showDetails() + " " + "No. de Puertas:" + numberDoors + " " + "Rentado";
    }

    @Override
    public String returnVehicle(){
        return showDetails() + " " + "No. de Puertas:" + numberDoors + " " + "Devuelto";
    }

}
