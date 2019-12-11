import java.util.Calendar;
import java.util.Date;

public class Vehicle implements Engine, Chassis {
  private Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  private String driveTrain;
  private Engine vehicleEngine;

  public Vehicle() {
    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleFrame = new VehicleFrame();
    this.vehicleType = "None";
    this.driveTrain = "2WD: Two-Wheel Drive";
    this.vehicleEngine = new ManufacturedEngine();
    vehicleEngine.setEngineType("88 AKI");
  }

  public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake, String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain, Engine vehicleEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;
  }

  @Override
  public Chassis getChassisType() {
    return this.vehicleFrame;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.vehicleEngine.setEngineCylinders(engineCylinders);
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    this.vehicleEngine.setEngineManufacturedDate(date);
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.vehicleEngine.setEngineManufacturer(manufacturer);
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.vehicleEngine.setEngineMake(engineMake);
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.vehicleEngine.setEngineModel(engineModel);
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineType(String fuel) {
    this.vehicleEngine.setEngineType(fuel);
  }

  @Override
  public String toString(){
    return "Manufacturer Name : " + this.vehicleManufacturer + "\n" +
        "Manufactured Date : " + this.vehicleManufacturedDate + "\n" +
        "Vehicle Make : " + this.vehicleMake + "\n" +
        "Vehicle Model : " + this.vehicleModel + "\n" +
        "Vehicle Type : " + this.vehicleType + "\n"
        + this.vehicleEngine.toString();
  }
  public static void main(String[] args){
    Vehicle a = new Vehicle();
    Vehicle b = new Vehicle(new Date(2012-1900,
        Calendar.JANUARY,
        3,
        7,
        13,
        19), "Honda", "Honda", "Prelude", new VehicleChassis(), null, "2WD: Two-Wheel Drive", new ManufacturedEngine("Honda", (new Date(2012-1900,
        Calendar.FEBRUARY,
        2,
        1,
        38,
        31)), "H-Series", "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drive"));
    System.out.println(a);
    System.out.println();
    System.out.println(b);
  }
}
