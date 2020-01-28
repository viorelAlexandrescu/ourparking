package ro.avs.ourparking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.avs.fgca.controller.BaseController;
import ro.avs.ourparking.model.Reservation;
import ro.avs.ourparking.service.ReservationService;

@RestController
@RequestMapping("reservations")
public class ReservationController extends BaseController<Reservation> {

    @Autowired
    public ReservationController(ReservationService service) {
        super(service);
    }
}
