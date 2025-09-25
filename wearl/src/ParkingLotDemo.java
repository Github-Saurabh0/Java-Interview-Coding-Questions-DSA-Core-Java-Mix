enum VehicleType {
    CAR, BIKE, TRUCK
}

class Vehicle {
    private String number;
    private VehicleType type;

    public Vehicle(String number, VehicleType type) {
        this.number = number;
        this.type = type;
    }

    public VehicleType getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }
}

class ParkingSpot {
    private int spotId;
    private VehicleType type;
    private boolean isOccupied;
    Vehicle vehicle;

    public ParkingSpot(int spotId, VehicleType type) {
        this.spotId = spotId;
        this.type = type;
    }

    public boolean park(Vehicle v) {
        if (!isOccupied && v.getType() == type) {
            vehicle = v;
            isOccupied = true;
            return true;
        }
        return false;
    }

    public void leave() {
        vehicle = null;
        isOccupied = false;
    }

    public boolean isFree() {
        return !isOccupied;
    }

    public VehicleType getType() {
        return type;
    }
}

class ParkingLot {
    private ParkingSpot[] spots;

    public ParkingLot(int capacity) {
        spots = new ParkingSpot[capacity];
        // For demo → half CAR spots, half BIKE spots
        for (int i = 0; i < capacity; i++) {
            VehicleType type = (i % 2 == 0) ? VehicleType.CAR : VehicleType.BIKE;
            spots[i] = new ParkingSpot(i, type);
        }
    }

    public boolean parkVehicle(Vehicle v) {
        for (ParkingSpot spot : spots) {
            if (spot.getType() == v.getType() && spot.isFree()) {
                spot.park(v);
                System.out.println("Parked " + v.getNumber() + " in spot " + spot.getType());
                return true;
            }
        }
        System.out.println("No available spot for " + v.getNumber());
        return false;
    }

    public void leaveVehicle(String number) {
        for (ParkingSpot spot : spots) {
            if (!spot.isFree() && spot.vehicle.getNumber().equals(number)) {
                spot.leave();
                System.out.println("Vehicle " + number + " left");
                return;
            }
        }
        System.out.println("Vehicle " + number + " not found!");
    }
}

public class ParkingLotDemo {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(4);

        Vehicle v1 = new Vehicle("UP14AA1234", VehicleType.CAR);
        Vehicle v2 = new Vehicle("UP14BB5678", VehicleType.BIKE);
        Vehicle v3 = new Vehicle("UP14CC1111", VehicleType.CAR);

        lot.parkVehicle(v1);
        lot.parkVehicle(v2);
        lot.parkVehicle(v3); // if space not available, it will fail

        lot.leaveVehicle("UP14AA1234");
        lot.parkVehicle(v3); // retry
    }
}
