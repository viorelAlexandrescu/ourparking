package ro.avs.ourparking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.avs.ourparking.model.Disability;
import ro.avs.ourparking.service.DisabilityService;

@RestController
@RequestMapping("/disabilities")
public class DisabilityController extends BaseController<Disability> {

    @Autowired
    public DisabilityController(DisabilityService service) {
        super(service);
    }
}
