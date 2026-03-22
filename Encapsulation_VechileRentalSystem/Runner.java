package out.gla.Encapsulation_VechileRentalSystem;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("UP32AB1234", 2000, "CAR123"));
        vehicles.add(new Bike("UP32XY5678", 800, "BIKE456"));
        vehicles.add(new Truck("UP32TR9999", 5000, "TRUCK789"));

        RentalService.processVehicles(vehicles, 5);
    }
}
