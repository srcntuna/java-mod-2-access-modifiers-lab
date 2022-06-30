public class Runner {
    public static void main(String[] args) {
        // your code here

        Garage myGarage = new Garage();
        myGarage.addCar(new Car("Mercedes", 2022));
        myGarage.addCar(new Car("BMW", 2020));
        myGarage.setCar(1, new Car("Lexus", 2021));
        System.out.println(myGarage.carList);

    }
}
