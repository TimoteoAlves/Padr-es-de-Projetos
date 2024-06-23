public class Main {
    public static void main(String[] args) {
        OldVehicleStorage oldVehicleStorage = new OldVehicleStorage();
        IVehicleStorage vehicleStorage = new VehicleStorageAdapter(oldVehicleStorage);

        Vehicle vehicle = new Vehicle("123", "Toyota Camry", 2020);
        vehicleStorage.saveVehicleData(vehicle);
    }
}