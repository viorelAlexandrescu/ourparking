package ro.avs.ourparking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.avs.fgca.controller.BaseController;
import ro.avs.ourparking.model.FuelType;
import ro.avs.ourparking.service.FuelTypeService;

@RestController
@RequestMapping("fuelTypes")
public class FuelTypeController extends BaseController<FuelType> {

    @Autowired
    public FuelTypeController(FuelTypeService service) {
        super(service);
    }
}
