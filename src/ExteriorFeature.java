public class ExteriorFeature implements Feature {
  private String exteriorFeature;

  public ExteriorFeature() {
    this.exteriorFeature = "Generic";
  }

  public ExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  @Override
  public String getFeature() {
    return this.exteriorFeature;
  }

  @Override
  public void setFeature(String feature) {
    this.exteriorFeature = feature;
  }

  @Override
  public String toString() {
    return "Exterior [" + this.exteriorFeature + "]";
  }

  public static void main(String[] args) {
    ExteriorFeature a = new ExteriorFeature();
    ExteriorFeature b = new ExteriorFeature("Fog Lamps");
    System.out.println(a);
    System.out.println();
    System.out.println(b);
  }
}
