
package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String getCar(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", "red", "Yellow"));
        list.add(new Car("Toyota", "green", "Blue"));
        list.add(new Car("Mercedes", "black", "black"));
        list.add(new Car("Volkswagen", "grey", "green"));
        list.add(new Car("Ford", "blue", "Yellow"));
        list = CarService.carsCount(list, allCars);
        model.addAttribute("list", list);
        return "car";
    }
}