public class Motorcycle extends Vehicle {

    private String handlebarType;

    public Motorcycle(String brand, String model, int year, int mileage, String handlebarType) {
        super(brand, model, year, mileage);
        this.handlebarType = handlebarType;
    }

    @Override
    public String rentVehicle(){
        return showDetails() + " " + "Tipo de manillar:" + handlebarType + " " + "Rentado";
    }

    @Override
    public String returnVehicle(){
        return showDetails() + " " + "Tipo de manillar:" + handlebarType + " " + "Devuelto";
    }

}
