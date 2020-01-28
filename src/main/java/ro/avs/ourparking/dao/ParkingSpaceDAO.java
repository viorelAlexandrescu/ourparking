package ro.avs.ourparking.dao;

import com.google.cloud.firestore.DocumentSnapshot;
import org.springframework.stereotype.Repository;
import ro.avs.fgca.dao.BaseDAO;
import ro.avs.ourparking.model.ParkingSpace;

@Repository
public class ParkingSpaceDAO extends BaseDAO<ParkingSpace> {
    @Override
    protected String getCollectionName() {
        return "Parking Space";
    }

    @Override
    protected ParkingSpace parseDocument(DocumentSnapshot document) {
        return new ParkingSpace(
                document.getId(),
                document.getString("name"),
                document.getBoolean("rechargeable"),
                document.getString("parkingLotId"),
                document.getString("disabilityType"),
                document.getBoolean("valid"),
                document.getBoolean("vacant")
        );
    }
}

