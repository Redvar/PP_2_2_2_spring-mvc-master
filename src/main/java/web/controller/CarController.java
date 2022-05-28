package web.controller;

import model.Car;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {


    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count,
                          Model model) {
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

        model.addAttribute("cars", cars.stream().limit(count).collect(Collectors.toList()));


        return "cars";
    }
}