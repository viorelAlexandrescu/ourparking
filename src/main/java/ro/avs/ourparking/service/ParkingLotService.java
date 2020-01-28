package ro.avs.ourparking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.avs.fgca.service.BaseService;
import ro.avs.ourparking.dao.ParkingLotDAO;
import ro.avs.ourparking.model.ParkingLot;

@Service
public class ParkingLotService extends BaseService<ParkingLot> {

    @Autowired
    public ParkingLotService(ParkingLotDAO dao) {
        super(dao);
    }
}
