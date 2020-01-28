package ro.avs.ourparking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.avs.fgca.model.BaseEntity;

@Getter
@Setter
@NoArgsConstructor
public class ParkingLot extends BaseEntity {
    private Boolean isUnderground;
    private Long floor;
    private String parkingLocationId;

    public ParkingLot(String id, Boolean isUnderground, Long floor, String parkingLocationId) {
        super(id);
        this.isUnderground = isUnderground;
        this.floor = floor;
        this.parkingLocationId = parkingLocationId;
    }
}
