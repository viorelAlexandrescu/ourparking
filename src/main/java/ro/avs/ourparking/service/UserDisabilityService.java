package ro.avs.ourparking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.avs.fgca.service.BaseService;
import ro.avs.ourparking.dao.UserDisabilityDAO;
import ro.avs.ourparking.model.UserDisability;

@Service
public class UserDisabilityService extends BaseService<UserDisability> {

    @Autowired
    public UserDisabilityService(UserDisabilityDAO dao) {
        super(dao);
    }
}
