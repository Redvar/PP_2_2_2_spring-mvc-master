package web.controller;

import model.Car;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {


    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count,
                          Model model) {
        if (count!=null & count > 6) {
            List<Car> carsList = new ArrayList<>();
            CarService carService = new CarService();
            carsList = carService.findCarsList();
            model.addAttribute("cars", carsList.stream().limit(count).collect(Collectors.toList()));
            return "cars";
        } else {
            return "/";
        }
    }
}