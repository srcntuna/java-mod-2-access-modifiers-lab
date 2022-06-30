public class Car {

  private String name;
  private int model;

  Car(String name, int model) {
    this.name = name;
    this.model = model;
  }

  public String getName() {
    return name;
  }

  public int getModel() {
    return model;
  }

  @Override
  public String toString() {
    return "name: " + name + " model: " + model;
  }

}
