package ro.avs.ourparking.dao;

import com.google.cloud.firestore.DocumentSnapshot;
import org.springframework.stereotype.Repository;
import ro.avs.fgca.dao.BaseDAO;
import ro.avs.ourparking.model.UserRole;

@Repository
public class UserRoleDAO extends BaseDAO<UserRole> {

    @Override
    protected String getCollectionName() {
        return "UserRoles";
    }

    @Override
    protected UserRole parseDocument(DocumentSnapshot document) {
        return new UserRole(
                document.getId(),
                document.getString("roleId"),
                document.getString("userId")
        );
    }
}
