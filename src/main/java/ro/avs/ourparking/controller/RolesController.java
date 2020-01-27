package ro.avs.ourparking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.avs.ourparking.model.Role;
import ro.avs.ourparking.service.RolesService;

@RestController
@RequestMapping("/roles")
public class RolesController extends BaseController<Role> {

    @Autowired
    public RolesController(RolesService rolesService) {
        super(rolesService);
    }
}
