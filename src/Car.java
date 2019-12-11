import java.util.Calendar;
import java.util.Date;

public class Car extends Vehicle {
  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {
    super();
    this.feature = new Feature[] {null};
    this.carAxle = 0;
  }

  public Car(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake, String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain, Engine vehicleEngine, Feature[] feature, int carAxle) {
    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame, vehicleType, driveTrain, vehicleEngine);
    this.feature = feature;
    this.carAxle = carAxle;
  }

  public String getExteriorFeatures() {
    String exteriorFeatureList = "Exterior Features ";
    int count = 0;
    for (int i = 0; i < feature.length; i++) {
      if (feature[i] instanceof ExteriorFeature && count == 0) {
        exteriorFeatureList = exteriorFeatureList + " : Exterior [" + feature[i].getFeature() + "]\n";
        count ++;
      }else if(feature[i] instanceof ExteriorFeature){
        exteriorFeatureList = exteriorFeatureList + "                   : Exterior [" + feature[i].getFeature() + "]\n";
        count++;
      }
    }
    return exteriorFeatureList;
  }

  public String getInteriorFeatures() {
    String interiorFeatureList = "Interior Features ";
    int count = 0;
    for (int i = 0; i < feature.length; i++) {
      if (feature[i] instanceof InteriorFeature && count == 0) {
        interiorFeatureList = interiorFeatureList + " : Interior [" + feature[i].getFeature() + "]\n";
        count++;
      }else if(feature[i] instanceof InteriorFeature){
        interiorFeatureList = interiorFeatureList + "                   : Interior [" + feature[i].getFeature() + "]\n";
        count++;
      }
    }
    return interiorFeatureList;
  }

  @Override
  public String toString() {
    int count = 0;
    String finalString = super.toString() + "\n";
    for (int i = 0; i < feature.length; i++) {
      if (feature[i] instanceof ExteriorFeature && count == 0) {
        finalString = finalString + "Features           : Exterior [" + feature[i].getFeature() + "]\n";
        count++;
      }else if (feature[i] instanceof InteriorFeature && count == 0){
        finalString = finalString + "Features           : Interior [" + feature[i].getFeature() + "]\n";
        count++;
      }else if (feature[i] instanceof ExteriorFeature) {
        finalString = finalString + "                   : Exterior [" + feature[i].getFeature() + "]\n";
        count++;
      }else if(feature[i] instanceof InteriorFeature){
        finalString = finalString + "                   : Interior [" + feature[i].getFeature() + "]\n";
        count++;
      }
    }
        return finalString + "Car Axle : " + this.carAxle;
  }

  public static void main(String[] args) {
    Feature[] feature = {new ExteriorFeature("Wood Panels"), new ExteriorFeature("Moon Roof"), new InteriorFeature("AM/FM Radio"), new InteriorFeature("Air Conditioning")};
    Car a = new Car(new Date(2012-1900,
        Calendar.JANUARY,
        3,
        7,
        13,
        19), "Honda", "Honda", "Prelude", new VehicleChassis(), null, "2WD: Two-Wheel Drive", new ManufacturedEngine("Honda", (new Date(2012-1900,
        Calendar.FEBRUARY,
        2,
        1,
        38,
        31)), "H-Series", "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drive"), feature,2);
    Car b = new Car();
    System.out.println(a.toString());
    System.out.println();
    System.out.println(b.toString());
  }
}
