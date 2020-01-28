package ro.avs.ourparking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.avs.fgca.model.BaseEntity;

@Getter
@Setter
@NoArgsConstructor
public class ParkingSpace extends BaseEntity {

    private String name;
    private Boolean rechargeable;
    private String parkingLotId;
    private String disabilityType;
    private Boolean valid;
    private Boolean vacant;

    public ParkingSpace(String id, String name, Boolean rechargeable, String parkingLotId, String disabilityType, Boolean valid, Boolean vacant) {
        super(id);
        this.name = name;
        this.rechargeable = rechargeable;
        this.parkingLotId = parkingLotId;
        this.disabilityType = disabilityType;
        this.valid = valid;
        this.vacant = vacant;
    }
}
