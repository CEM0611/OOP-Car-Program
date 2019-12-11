public class InteriorFeature implements Feature {
  private String interiorFeature;

  public InteriorFeature() {
    this.interiorFeature = "Generic";
  }

  public InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  @Override
  public String getFeature() {
    return this.interiorFeature;
  }

  @Override
  public void setFeature(String feature) {
    this.interiorFeature = feature;
  }

  @Override
  public String toString() {
    return "Interior [" + this.interiorFeature + "]";
  }

  public static void main(String[] args) {
    InteriorFeature a = new InteriorFeature();
    InteriorFeature b = new InteriorFeature("Climate Control");
    System.out.println(a);
    System.out.println();
    System.out.println(b);
  }
}
