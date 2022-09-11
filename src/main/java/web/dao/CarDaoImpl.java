package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    public List<Car> carsList = Arrays.asList(
            new Car("brand1", "model1", "color1"),
            new Car("brand2", "model2", "color2"),
            new Car("brand3", "model3", "color3"),
            new Car("brand4", "model4", "color4"),
            new Car("brand5", "model5", "color5"));

    @Override
    public List<Car> getCars(int amount) {
        return carsList.stream().limit(amount).toList();
    }
}
