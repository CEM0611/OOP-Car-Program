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
  @Override
  public String toString(){
    return String.format("Chassis Name: " + this.chassisName);
  }
  public static void main(String[] args){
    VehicleChassis example1 = new VehicleChassis();
    VehicleChassis example2 = new VehicleChassis("A-2");
    System.out.println(example1.toString());
    System.out.println(example2.toString());
  }
}
