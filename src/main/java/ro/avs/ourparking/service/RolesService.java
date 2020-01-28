package ro.avs.ourparking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.avs.fgca.service.BaseService;
import ro.avs.ourparking.dao.RolesDAO;
import ro.avs.ourparking.model.Role;

@Service
public class RolesService extends BaseService<Role> {

    @Autowired
    public RolesService(RolesDAO rolesDAO) {
        super(rolesDAO);
    }
}
