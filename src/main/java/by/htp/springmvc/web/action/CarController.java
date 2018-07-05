package by.htp.springmvc.web.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import by.htp.springmvc.dao.domain.Car;

@Controller
@RequestMapping("/cars") //
public class CarController {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Car> cars(){
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("BMW"));
		cars.add(new Car("Audi"));
		return cars;
	}

}