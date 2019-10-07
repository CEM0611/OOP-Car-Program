public class VehicleChassis implements Chassis{
  private String chassisName;
  public VehicleChassis(){
    this.chassisName = chassis;
  }
  public VehicleChassis(String chassisName){
    this.chassisName = chassisName;
  }

  public Chassis getChassisType() {
    return this;
  }
  public void setChassisType(String vehicleChassis) {
    this.chassisName = vehicleChassis;
  }
  public void toString(String vehicleChassis){
    System.out.println("Chassis Name: " + this.chassisName);
  }
}
