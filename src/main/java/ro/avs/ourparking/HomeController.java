package ro.avs.ourparking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.avs.ourparking.service.RolesService;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

@RestController
public class HomeController {

    private RolesService rolesService;

    @Autowired
    public HomeController(RolesService rolesService) {
        this.rolesService = rolesService;
    }

    @GetMapping("/home")
    public String getHome() throws IOException, ExecutionException, InterruptedException {
        return rolesService.getAllRolesAsJSONString();
    }
}
