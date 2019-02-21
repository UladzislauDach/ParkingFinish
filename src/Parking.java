import java.util.ArrayList;
import java.util.List;

public class Parking {

   private List<Car> cars = new ArrayList<>();

    public Parking(List<Car> cars) {
        this.cars = cars;
    }
    public Parking(){}

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void removeCar(Car car){
        cars.remove(car);
    }

    @Override
    public String toString() {
        return "Parking{" +
                "cars=" + cars +
                '}';
    }


    public static void vacancies(List<Car> cars){
        Car[] auto = new Car[5];
        if(auto.length == cars.size()){
            auto = cars.toArray( new Car[cars.size()]);
        }if(auto.length != cars.size()){
            cars.remove(cars.size()-1);
        }
    }
}
