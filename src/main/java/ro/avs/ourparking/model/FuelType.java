package ro.avs.ourparking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.avs.fgca.model.BaseEntity;

@Getter
@Setter
@NoArgsConstructor
public class FuelType extends BaseEntity {
    private String fuelId;

    public FuelType(String id, String fuelId) {
        super(id);
        this.fuelId = fuelId;
    }
}
