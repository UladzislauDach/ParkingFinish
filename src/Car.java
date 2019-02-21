import java.util.Objects;

public class Car {

    private String nameCar;
    private String colourCar;
    private boolean transmission ;
    private boolean trailer;
    private int weight;

    public Car(String nameCar, String colourCar, boolean transmission, boolean trailer, int weight) {
        this.nameCar = nameCar;
        this.colourCar = colourCar;
        this.transmission = transmission;
        this.trailer = trailer;
        this.weight = weight;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getColourCar() {
        return colourCar;
    }

    public void setColourCar(String colourCar) {
        this.colourCar = colourCar;
    }

    public boolean isTransmission() {
        return transmission;
    }

    public void setTransmission(boolean transmission) {
        this.transmission = transmission;
    }

    public boolean isTrailer() {
        return trailer;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return transmission == car.transmission &&
                trailer == car.trailer &&
                weight == car.weight &&
                Objects.equals(nameCar, car.nameCar) &&
                Objects.equals(colourCar, car.colourCar);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nameCar, colourCar, transmission, trailer, weight);
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameCar='" + nameCar + '\'' +
                ", colourCar='" + colourCar + '\'' +
                ", transmission=" + transmission +
                ", trailer=" + trailer +
                ", weight=" + weight +
                '}';
    }
}
