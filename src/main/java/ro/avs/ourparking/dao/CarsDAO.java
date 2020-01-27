package ro.avs.ourparking.dao;

import com.google.cloud.firestore.DocumentSnapshot;
import org.springframework.stereotype.Repository;
import ro.avs.ourparking.model.Car;

@Repository
public class CarsDAO extends BaseDAO<Car> {

    @Override
    protected String getCollectionName() {
        return "Cars";
    }

    @Override
    protected Car parseDocument(DocumentSnapshot document) {
        return new Car(
                document.getId(),
                document.getString("carPlate"),
                document.getString("fuelType"),
                document.getString("userId")
        );
    }
}
