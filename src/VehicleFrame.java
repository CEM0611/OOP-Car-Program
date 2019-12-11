public class VehicleFrame implements Chassis {
  private String vehicleFrameType;

  public VehicleFrame() {
    this.vehicleFrameType = "Unibody";
  }

  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  public Chassis getChassisType() {
    return this;
  }

  public void setChassisType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  @Override
  public String toString() {
    return "Chassis : Chassis \n"
        + "Vehicle Frame : "
        + this.vehicleFrameType;
  }

  public static void main(String[] args){
    VehicleFrame vehicleFrame1 = new VehicleFrame();
    System.out.println(vehicleFrame1+"\n");
    VehicleFrame vehicleFrame2 = new VehicleFrame("Ladder Frame");
    System.out.println(vehicleFrame2+"\n");
  }
}