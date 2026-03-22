package out.gla.Encapsulation_VechileRentalSystem;
public class Car extends Vehicle implements Insurable {

    private String insurancePolicyNumber; // Encapsulated

    public Car(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}