package ro.avs.ourparking.dao;

import com.google.cloud.firestore.DocumentSnapshot;
import org.springframework.stereotype.Repository;
import ro.avs.fgca.dao.BaseDAO;
import ro.avs.ourparking.model.ParkingLocation;

@Repository
public class ParkingLocationDAO extends BaseDAO<ParkingLocation> {
    @Override
    protected String getCollectionName() {
        return "Parking Location";
    }

    @Override
    protected ParkingLocation parseDocument(DocumentSnapshot document) {
        return new ParkingLocation(
                document.getId(),
                document.getString("name"),
                document.getString("address"),
                document.getLong("latitude"),
                document.getLong("longitude")
        );
    }
}
