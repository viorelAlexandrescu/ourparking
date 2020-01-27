package ro.avs.ourparking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.avs.ourparking.model.Car;
import ro.avs.ourparking.service.CarsService;

@RestController
@RequestMapping("/cars")
public class CarsController extends BaseController<Car> {

    @Autowired
    public CarsController(CarsService service) {
        super(service);
    }
}
