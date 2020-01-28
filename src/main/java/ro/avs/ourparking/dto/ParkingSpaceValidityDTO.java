package ro.avs.ourparking.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ParkingSpaceValidityDTO {
    private String parkingSpaceId;
    private Boolean valid;
}
