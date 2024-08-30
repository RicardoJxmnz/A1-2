public class App {
    public static void main(String[] args) throws Exception {

        Vehicle vehicle[] = new Vehicle[5];

        vehicle[0] = new Car("VW", "Jetta", 2011, 1200, 4);
        vehicle[1] = new Motorcycle("Italika", "RT200", 2010, 800,"Cruiser");
        vehicle[2] = new Truck("Renault", " Magnum ", 2001, 600, 50);
        vehicle[3] = new Car("BMW", "Serie 1 128ti", 2024, 120, 4);
        vehicle[4] = new Truck("Mazda", "Titan", 2007, 1500, 60);

        /*Car car = new Car("VW", "Jetta", 2011, 1200, 4);
        Motorcycle motorcycle = new Motorcycle("Italika", "RT200", 2010, 100,"Cruiser");
        Truck truck = new Truck("Renault", " Magnum ", 2001, 188, 50);*/
        
        //Vehicle vehicle = car;

        for(int i=0;i<=4;i++){
            System.out.println(vehicle[i].rentVehicle());
        }

        System.err.println("");

        for(int i=0;i<=4;i++){
            System.out.println(vehicle[i].returnVehicle());
        }
    }
}
