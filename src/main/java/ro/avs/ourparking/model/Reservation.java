package ro.avs.ourparking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.avs.fgca.model.BaseEntity;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Reservation extends BaseEntity {
    private String carId;
    private String parkingSpaceId;
    private String userId;
    private Long reservedHours;
    private Date reservationDateTimeStart;
    private Date dateTimeCreated;

    public Reservation(String id, String carId, String parkingSpaceId, String userId, Long reservedHours, Date reservationDateTimeStart, Date dateTimeCreated) {
        super(id);
        this.carId = carId;
        this.parkingSpaceId = parkingSpaceId;
        this.userId = userId;
        this.reservedHours = reservedHours;
        this.reservationDateTimeStart = reservationDateTimeStart;
        this.dateTimeCreated = dateTimeCreated;
    }
}
