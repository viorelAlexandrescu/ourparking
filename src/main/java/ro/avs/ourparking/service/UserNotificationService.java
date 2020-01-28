package ro.avs.ourparking.service;

import org.springframework.stereotype.Service;
import ro.avs.fgca.service.BaseService;
import ro.avs.ourparking.dao.UserNotificationDAO;
import ro.avs.ourparking.model.UserNotification;

@Service
public class UserNotificationService extends BaseService<UserNotification> {

    public UserNotificationService(UserNotificationDAO dao) {
        super(dao);
    }
}
