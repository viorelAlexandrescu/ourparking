package ro.avs.ourparking.dao;

import com.google.cloud.firestore.DocumentSnapshot;
import org.springframework.stereotype.Repository;
import ro.avs.fgca.dao.BaseDAO;
import ro.avs.ourparking.model.FuelType;

@Repository
public class FuelTypeDAO extends BaseDAO<FuelType> {

    @Override
    protected String getCollectionName() {
        return "Fuel Types";
    }

    @Override
    protected FuelType parseDocument(DocumentSnapshot document) {
        return new FuelType(
                document.getId(),
                document.getString("name")
        );
    }
}
