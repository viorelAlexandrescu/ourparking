package ro.avs.ourparking.dao;

import com.google.cloud.firestore.DocumentSnapshot;
import org.springframework.stereotype.Repository;
import ro.avs.fgca.dao.BaseDAO;
import ro.avs.ourparking.model.UserDisability;

@Repository
public class UserDisabilityDAO extends BaseDAO<UserDisability> {

    @Override
    protected String getCollectionName() {
        return "UserDisability";
    }

    @Override
    protected UserDisability parseDocument(DocumentSnapshot document) {
        return new UserDisability(
                document.getId(),
                document.getString("userId"),
                document.getString("disabilityId")
        );
    }
}
