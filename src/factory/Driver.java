package factory;

public class Driver {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = OperatingSystemFactory.getInstance("LINUX","3.5", "X64");
        System.out.println(operatingSystem.getVersion());
        System.out.println(operatingSystem.getArchitecture());
    }
}
