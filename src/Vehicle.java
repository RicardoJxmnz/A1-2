public abstract class Vehicle {

    private String brand;
    private String model;
    private int year;
    private int mileage;


    public Vehicle(String brand, String model, int year, int mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public abstract String rentVehicle();
    public abstract String returnVehicle();

    public String showDetails(){
        return ("Marca:"+ brand + " " + "Modelo:" + model + " " + "Año:" + year + " " + "Kilometraje:" + mileage);
    }
    
    
}