package prototype;

public class FourWheelerVehicle extends Vehicle {
    private boolean isDiesel;
    private boolean automatic;

    public FourWheelerVehicle(String engine, String model, long price, boolean automatic, boolean isDiesel) {
        super(engine, model, price);
        this.automatic = automatic;
        this.isDiesel = isDiesel;
    }


    @Override
    protected FourWheelerVehicle clone() throws CloneNotSupportedException {
        return (FourWheelerVehicle) super.clone();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FourWheelerVehicle{");
        sb.append("model=").append(super.getModel());
        sb.append(", engine=").append(super.getEngine());
        sb.append(", isDiesel=").append(isDiesel);
        sb.append(", automatic=").append(automatic);
        sb.append('}');
        return sb.toString();
    }
}
