package ro.avs.ourparking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.avs.fgca.service.BaseService;
import ro.avs.ourparking.dao.FuelTypeDAO;
import ro.avs.ourparking.model.FuelType;

@Service
public class FuelTypeService extends BaseService<FuelType> {

    @Autowired
    public FuelTypeService(FuelTypeDAO dao) {
        super(dao);
    }
}
