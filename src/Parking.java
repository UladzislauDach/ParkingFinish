import java.util.ArrayList;
import java.util.List;

public class Parking {

   private int space;
   private List<Car> cars = new ArrayList<>();

    public Parking(List<Car> cars , int space) {
        this.cars = cars;
        this.space = space;
    }
    public Parking(){}

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

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


    public static void maxSize(List<Car> cars , int space ){
        Car[] auto = new Car[space];
        if(auto.length == cars.size()){
            auto = cars.toArray( new Car[cars.size()]);
        }if(auto.length != cars.size()){
            cars.remove(cars.size()-1);
        }
    }

    public static void removeWeightTransmission(List<Car> cars){
        for (int i = 0; i <cars.size() ; i++) {
            if(cars.get(i).getWeight() >= 3000 | cars.get(i).isTrailer()){
                cars.remove(cars.get(i));
            }
        }
    }

    public static int parkingExtension(int space ,int N ){
        return (space + N);
    }

}
