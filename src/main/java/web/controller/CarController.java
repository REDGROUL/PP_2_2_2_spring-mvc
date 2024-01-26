package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {


        List<Car> cars = carService.getCars(count);
        model.addAttribute("listCars", cars);
        model.addAttribute("qparam", count);
        return "cars";
    }
}
