package ro.avs.ourparking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.avs.fgca.service.BaseService;
import ro.avs.ourparking.dao.ReservationDAO;
import ro.avs.ourparking.model.Reservation;

@Service
public class ReservationService extends BaseService<Reservation> {

    @Autowired
    public ReservationService(ReservationDAO dao) {
        super(dao);
    }
}
