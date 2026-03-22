package out.gla.Encapsulation_VechileRentalSystem;
import java.util.List;

public class RentalService {

    public static void processVehicles(List<Vehicle> vehicles, int days) {

        for (int i = 0; i < vehicles.size(); i++) {

            Vehicle v = vehicles.get(i);

            double rentalCost = v.calculateRentalCost(days);
            double insuranceCost = 0;

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                insuranceCost = ins.calculateInsurance();
            }

            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Type: " + v.getType());
            System.out.println("Rental Cost: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);

            if (v instanceof Insurable) {
                System.out.println(((Insurable) v).getInsuranceDetails());
            }

            System.out.println("---------------------------");
        }
    }
}
