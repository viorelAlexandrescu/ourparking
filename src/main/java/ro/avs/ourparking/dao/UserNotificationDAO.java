package ro.avs.ourparking.dao;

import com.google.cloud.firestore.DocumentSnapshot;
import org.springframework.stereotype.Repository;
import ro.avs.fgca.dao.BaseDAO;
import ro.avs.ourparking.model.UserNotification;
import ro.avs.ourparking.model.UserNotificationStatus;

@Repository
public class UserNotificationDAO extends BaseDAO<UserNotification> {
    @Override
    protected String getCollectionName() {
        return "User Notifications";
    }

    @Override
    protected UserNotification parseDocument(DocumentSnapshot document) {
        return new UserNotification(
                document.getId(),
                document.getString("reservationId"),
                UserNotificationStatus.valueOf(document.getString("status"))
        );
    }
}
