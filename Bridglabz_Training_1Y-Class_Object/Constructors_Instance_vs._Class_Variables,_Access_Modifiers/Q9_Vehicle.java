class Q9_Vehicle {
    String ownerName;
    String vehicleType;

    static int registrationFee = 500;

    Q9_Vehicle(String o, String v) {
        ownerName = o;
        vehicleType = v;
    }

    void displayVehicleDetails() {
        System.out.println(ownerName + " " + vehicleType);
    }

    static void updateRegistrationFee(int fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Q9_Vehicle v = new Q9_Vehicle("Amit", "Car");
        v.displayVehicleDetails();
        System.out.println(registrationFee);
    }
}