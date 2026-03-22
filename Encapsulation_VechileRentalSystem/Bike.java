package out.gla.Encapsulation_VechileRentalSystem;
public class Bike extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // cheaper than car
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }
}