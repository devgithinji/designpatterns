package prototype;

public class Main {


    public static void main(String[] args) throws CloneNotSupportedException {
        FourWheelerVehicle fourWheelerVehicle = (FourWheelerVehicle) VehicleRegistry.getVehicle("FOUR");
        System.out.println(fourWheelerVehicle);

    }
}
