package ro.avs.ourparking.dao;

import com.google.cloud.firestore.DocumentSnapshot;
import org.springframework.stereotype.Repository;
import ro.avs.ourparking.model.Disability;

@Repository
public class DisabilityDAO extends BaseDAO<Disability> {

    @Override
    protected String getCollectionName() {
        return "Disability";
    }

    @Override
    protected Disability parseDocument(DocumentSnapshot document) {
        return new Disability(
                document.getId(),
                document.getString("disabilityName")
        );
    }
}
