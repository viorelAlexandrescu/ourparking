package ro.avs.ourparking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.avs.fgca.model.BaseEntity;

@Getter
@Setter
@NoArgsConstructor
public class Car extends BaseEntity {
    private String carPlate;
    private String fuelType;
    private String userId;

    public Car(String id, String carPlate, String fuelType, String userId) {
        super(id);
        this.carPlate = carPlate;
        this.fuelType = fuelType;
        this.userId = userId;
    }
}
