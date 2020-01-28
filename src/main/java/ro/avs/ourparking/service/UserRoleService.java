package ro.avs.ourparking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.avs.fgca.service.BaseService;
import ro.avs.ourparking.dao.UserRoleDAO;
import ro.avs.ourparking.model.UserRole;

@Service
public class UserRoleService extends BaseService<UserRole> {

    @Autowired
    public UserRoleService(UserRoleDAO dao) {
        super(dao);
    }
}
