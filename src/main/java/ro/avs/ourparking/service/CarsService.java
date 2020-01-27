package ro.avs.ourparking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.avs.ourparking.dao.CarsDAO;
import ro.avs.ourparking.model.Car;

@Service
public class CarsService extends BaseService<Car> {

    @Autowired
    public CarsService(CarsDAO carsDAO) {
        super(carsDAO);
    }
}
