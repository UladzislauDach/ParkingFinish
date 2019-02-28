import java.util.*;
//saddsa
public class Main {

    public static void main(String[] args) {

        Car bmw34 = new Car("bmw", "Red", true, false, 1500);
        Car audi = new Car("audi", "white", false, false, 1200);
        Car kia = new Car("kia", "white", true, true, 3100);
        Car volkswagen = new Car("vгolkswagen", "black", true, true, 4000);
        Car bmw39 = new Car("bmw", "black", false, false, 1600);
        Car kiaTheBest = new Car("kia", "green", true, false, 2000);
        Car audiA4 = new Car("audi", "white", false, true, 2500);

        Parking parkings = new Parking(5);

        parkings.addCar(bmw34);
        parkings.addCar(audi);
        parkings.addCar(kia);
        parkings.addCar(volkswagen);
        parkings.addCar(audiA4);
        parkings.addCar(bmw39);
        parkings.addCar(kiaTheBest);

        Collections.sort(parkings.getCars());
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



        System.out.println("Введите количество мест на парковке");
       Scanner sc = new Scanner(System.in);
        int mesta = sc.nextInt();

        Parking.maxSize(parkings.getCars() , mesta);

        System.out.println("Введите на сколько увеличить размер парковки");
        Scanner scanner = new Scanner(System.in);
        int number =scanner.nextInt();
        System.out.println(Parking.parkingExtension( mesta , number));

        sortColour((parkings.getCars()));

        sortTransmission((parkings.getCars()));

        System.out.println(indenticalCars(parkings.getCars()));

        Parking.removeWeightTransmission(parkings.getCars());


    }

    private static int indenticalCars(List<Car> parking) {
        int counter = 0;
        for (int i = 0; i < parking.size(); i++) {
            for (int j = 0; j < parking.size(); j++) {
                if (parking.get(i).getNameCar().equals(parking.get(j).getNameCar()) && parking.get(i).getColourCar().equals(parking.get(j).getColourCar())) {
                    counter++;
                }
            }

        }
        return (counter - parking.size());
    }


    public static int sortTransmission(List<Car> parkings) {
        int quantityAutoTransmission = 0;
        for (Car car : parkings) {
            if (car.isTransmission()) {
                quantityAutoTransmission++;
            }

        }
        return quantityAutoTransmission;
    }

    public static int sortColour(List<Car> parkings) {
        int counter = 0;
        for (Car h : parkings) {
            if (h.getColourCar().equals("white")) {
                counter++;
            }
        }
        return counter;
    }


}
