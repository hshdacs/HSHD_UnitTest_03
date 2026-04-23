import java.util.ArrayList;
import java.util.List;

public class MarketPlace {
    private List<Car> listOfCars;

    public MarketPlace() {
        listOfCars = new ArrayList<>();
    }

    // (1 - very bad) exposing our internal structure
    public List<Car> getListOfCars() {
        return listOfCars;
    }

    // (2 - still bad) - shallow copy
    public List<Car> getListOfCars2() {
        List<Car> newListOfCars = new ArrayList<>( listOfCars.size() );
        newListOfCars.addAll(listOfCars);
        return newListOfCars;
    }

    // (3 - okay) - DeepCopy
    public List<Car> getListOfCars3() {
        List<Car> newListOfCars = new ArrayList<>( listOfCars.size() );
        for (Car car : listOfCars) {
            //newListOfCars.add( car.clone() );
            newListOfCars.add( new Car(car.getYearOfConstruction(), car.getPower()));
        }
        return newListOfCars;
    }

    public void addCar(Car car) {
        listOfCars.add(car);
    }

    public double getPriceForAllCars() {
        double price = 0.0;
        for (Car car : listOfCars) {
            price += car.sellingValue();
        }
        return price;
    }
}
