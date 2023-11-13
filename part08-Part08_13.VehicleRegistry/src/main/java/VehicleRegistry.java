import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry = new HashMap<>();

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registry == null || !this.registry.containsKey(licensePlate)) {
            this.registry.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            return this.registry.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : registry.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> ownersPrinted = new ArrayList<>();
        for (String owner : registry.values()) {
            if (!ownersPrinted.contains(owner)) {
                ownersPrinted.add(owner);
            }
        }
        for (String owner:ownersPrinted){
            System.out.println(owner);
        }
    }
}
