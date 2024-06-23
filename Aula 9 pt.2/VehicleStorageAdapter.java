public class VehicleStorageAdapter implements IVehicleStorage {
    private OldVehicleStorage oldVehicleStorage;

    public VehicleStorageAdapter(OldVehicleStorage oldVehicleStorage) {
        this.oldVehicleStorage = oldVehicleStorage;
    }

    @Override
    public void saveVehicleData(Vehicle vehicle) {
        String data = String.format("ID: %s, Modelo: %s, Ano: %d",
                                    vehicle.getId(), vehicle.getModel(), vehicle.getYear());
        oldVehicleStorage.storeVehicleData(data);
    }
}