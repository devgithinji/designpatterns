package prototype;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private static Map<String, Vehicle> mapVehicles = new HashMap<>();

    static {
        mapVehicles.put("TWO", new TwoWheelerVehicle("120", "honda", 120000, true));
        mapVehicles.put("FOUR", new FourWheelerVehicle("2500", "toyota", 1200000, true, false));
    }


    public static Vehicle getVehicle(String vehicle) throws CloneNotSupportedException {
        return mapVehicles.get(vehicle).clone();
    }
}
