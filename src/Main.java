import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Car bmw34 = new Car("bmw", "Red", true, false, 1500);
        Car audi = new Car("audi", "white", false, false, 1200);
        Car kia = new Car("kia", "white", true, true, 3100);
        Car volkswagen = new Car("vгolkswagen", "black", true, true, 4000);
        Car bmw39 = new Car("bmw", "black", false, false, 1600);
        Car kiaTheBest = new Car("kia", "green", true, false, 2000);
        Car audiA4 = new Car("audi", "white", false, true, 2500);

        Parking parkings = new Parking();

        parkings.addCar(bmw34);
        parkings.addCar(audi);
        parkings.addCar(kia);
        parkings.addCar(volkswagen);
        parkings.addCar(audiA4);
        parkings.addCar(bmw39);
       // Collections.sort(parkings.getCars());
        Comparator<Car> nameComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1 == null && o2 == null) {
                    return 0;
                }
                if (o1 != null && o2 == null) {
                    return 1;
                }
                if (o1 == null && o2 != null) {
                    return -1;
                }
                return o1.getNameCar().compareTo(o2.getNameCar());
            }
        };
        Collections.sort(parkings.getCars(), nameComparator);

        System.out.println(parkings);

        System.out.println(sortColour(( parkings.getCars())));

        System.out.println(sortTransmission(( parkings.getCars())));

        Parking.vacancies(parkings.getCars());

        System.out.println(parkings);

    }
    public static int sortTransmission(List<Car> parkings) {
        int quantityAutoTransmission = 0;
        for (Car car: parkings) {
            if(car.isTransmission() == true){
                quantityAutoTransmission++;
            }

        }
        return quantityAutoTransmission;
    }

    public static int sortColour(List<Car> parkings) {
        int counter = 0;
        for (Car h: parkings) {
            if(h.getColourCar() == "white"){
                counter++;
            }
        }
        return counter;
    }


}
