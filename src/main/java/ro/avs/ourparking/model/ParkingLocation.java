package ro.avs.ourparking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.avs.fgca.model.BaseEntity;

@Getter
@Setter
@NoArgsConstructor
public class ParkingLocation extends BaseEntity {

    private String name;
    private String address;
    private Long latitude;
    private Long longitude;

    public ParkingLocation(String id, String name, String address, Long latitude, Long longitude) {
        super(id);
        this.name = name;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
