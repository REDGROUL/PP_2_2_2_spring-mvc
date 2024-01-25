package web.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImpl implements  CarDao{

    @Override
    public List<Car> getCars() {
        return Arrays.asList(
                new Car("Audi", 10, 2),
                new Car("Audi1", 10, 2),
                new Car("Audi2", 10, 2),
                new Car("Audi3", 10, 2),
                new Car("Audi4", 10, 2)
         );

    }
}
