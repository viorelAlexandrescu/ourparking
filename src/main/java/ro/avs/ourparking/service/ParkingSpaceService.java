package ro.avs.ourparking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.avs.fgca.service.BaseService;
import ro.avs.ourparking.dao.ParkingSpaceDAO;
import ro.avs.ourparking.model.ParkingSpace;

@Service
public class ParkingSpaceService extends BaseService<ParkingSpace> {

    @Autowired
    public ParkingSpaceService(ParkingSpaceDAO dao) {
        super(dao);
    }
}
