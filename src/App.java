public class App {
    public static void main(String[] args) throws Exception {

        Car car = new Car("VW", "Jetta", 2011, 1200, 4);
        Motorcycle motorcycle = new Motorcycle("Italika", " ", 2010, 100,"Cruiser");
        Truck truck = new Truck("Renault", " Magnum ", 2001, 188, 50);
        
        Vehicle vehicle = car;

        System.out.println(vehicle.rentVehicle());
        System.out.println(vehicle.returnVehicle());
    }
}
