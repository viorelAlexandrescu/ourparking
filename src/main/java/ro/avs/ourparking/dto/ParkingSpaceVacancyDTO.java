package ro.avs.ourparking.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ParkingSpaceVacancyDTO {
    private String parkingSpaceId;
    private Boolean vacant;
}
