package ro.avs.ourparking.dao;

import com.google.cloud.firestore.DocumentSnapshot;
import org.springframework.stereotype.Repository;
import ro.avs.fgca.dao.BaseDAO;
import ro.avs.ourparking.model.Reservation;

@Repository
public class ReservationDAO extends BaseDAO<Reservation> {
    @Override
    protected String getCollectionName() {
        return "Reservations";
    }

    @Override
    protected Reservation parseDocument(DocumentSnapshot document) {
        return new Reservation(
                document.getId(),
                document.getString("carId"),
                document.getString("parkingSpaceId"),
                document.getLong("reservedHours"),
                document.getDate("reservationDateTimeStart"),
                document.getDate("dateTimeCreated")
        );
    }
}
