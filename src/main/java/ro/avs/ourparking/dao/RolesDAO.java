package ro.avs.ourparking.dao;

import com.google.cloud.firestore.DocumentSnapshot;
import org.springframework.stereotype.Repository;
import ro.avs.ourparking.model.Role;

@Repository
public class RolesDAO extends BaseDAO<Role> {

    @Override
    protected String getCollectionName() {
        return "Roles";
    }

    @Override
    protected Role parseDocument(DocumentSnapshot document) {
        return new Role(
                document.getId(),
                document.getString("role")
        );
    }
}
