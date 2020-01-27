package ro.avs.ourparking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.avs.ourparking.model.Role;
import ro.avs.ourparking.service.RolesService;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
public class HomeController {

    private RolesService rolesService;

    @Autowired
    public HomeController(RolesService rolesService) {
        this.rolesService = rolesService;
    }

    @GetMapping("/home")
    public List<Role> getHome() throws ExecutionException, InterruptedException {
        return rolesService.getAllRoles();
    }

    @PostMapping("/alter")
    public void setNewHole(@RequestBody Role role) {
        rolesService.addRole(role);
    }

    @GetMapping("/base")
    public Role getRoleById(@RequestParam String id) throws ExecutionException, InterruptedException {
        return rolesService.getRoleById(id);
    }
}
