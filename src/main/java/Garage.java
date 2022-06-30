import java.util.ArrayList;
import java.util.List;

public class Garage {

  List<Car> carList = new ArrayList<Car>();

  public Garage() {
    this.carList = new ArrayList<Car>();

  }

  public void addCar(Car car) {
    this.carList.add(car);
  }

  public Car getCar(int index) {
    return carList.get(index);
  }

  public void setCar(int index, Car car) {
    carList.set(index, car);
  }

}
