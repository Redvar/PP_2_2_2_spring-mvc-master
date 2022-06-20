package web.service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public List<Car> findCarsList(){
        List<Car> cars = new ArrayList<>();

        Car car1 = new Car("Lada", "6", "yellow");
        Car car2 = new Car("Audi", "A5", "red");
        Car car3 = new Car("Peugeot", "406", "green");
        Car car4 = new Car("Mercedes", "600", "blue");
        Car car5 = new Car("Fiat", "124", "black");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        return cars;
    }
}
