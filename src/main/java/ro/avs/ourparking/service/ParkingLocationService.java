package ro.avs.ourparking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.avs.fgca.service.BaseService;
import ro.avs.ourparking.dao.ParkingLocationDAO;
import ro.avs.ourparking.model.ParkingLocation;

@Service
public class ParkingLocationService extends BaseService<ParkingLocation> {

    @Autowired
    public ParkingLocationService(ParkingLocationDAO dao) {
        super(dao);
    }
}
