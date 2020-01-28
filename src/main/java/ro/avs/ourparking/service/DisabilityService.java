package ro.avs.ourparking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.avs.fgca.service.BaseService;
import ro.avs.ourparking.dao.DisabilityDAO;
import ro.avs.ourparking.model.Disability;

@Service
public class DisabilityService extends BaseService<Disability> {

    @Autowired
    public DisabilityService(DisabilityDAO dao) {
        super(dao);
    }
}
