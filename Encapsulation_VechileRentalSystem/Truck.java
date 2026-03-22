package out.gla.Encapsulation_VechileRentalSystem;
public class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5; // trucks are expensive
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}