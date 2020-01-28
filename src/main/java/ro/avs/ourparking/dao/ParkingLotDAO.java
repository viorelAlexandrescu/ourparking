package ro.avs.ourparking.dao;

import com.google.cloud.firestore.DocumentSnapshot;
import org.springframework.stereotype.Repository;
import ro.avs.fgca.dao.BaseDAO;
import ro.avs.ourparking.model.ParkingLot;

@Repository
public class ParkingLotDAO extends BaseDAO<ParkingLot> {
    @Override
    protected String getCollectionName() {
        return "Parking Lot";
    }

    @Override
    protected ParkingLot parseDocument(DocumentSnapshot document) {
        return new ParkingLot(
                document.getId(),
                document.getBoolean("isUnderground"),
                document.getLong("floor"),
                document.getString("parkingLocationId")
        );
    }
}
