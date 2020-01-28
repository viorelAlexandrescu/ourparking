package ro.avs.ourparking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.avs.fgca.controller.BaseController;
import ro.avs.ourparking.dto.ParkingSpaceVacancyDTO;
import ro.avs.ourparking.dto.ParkingSpaceValidityDTO;
import ro.avs.ourparking.model.ParkingSpace;
import ro.avs.ourparking.service.ParkingSpaceService;

@RestController
@RequestMapping("parking-spaces")
public class ParkingSpaceController extends BaseController<ParkingSpace> {

    private ParkingSpaceService service;

    @Autowired
    public ParkingSpaceController(ParkingSpaceService service) {
        super(service);
        this.service = service;
    }

    @PostMapping("valid")
    public void changeParkingSpaceValidity(@RequestBody ParkingSpaceValidityDTO dto) {
        service.changeParkingSpaceValidity(dto.getParkingSpaceId(), dto.getValid());
    }

    @PostMapping("vacant")
    public void changeParkingSpaceVacancy(@RequestBody ParkingSpaceVacancyDTO dto) {
        service.changeParkingSpaceVacancy(dto.getParkingSpaceId(), dto.getVacant());
    }
}
