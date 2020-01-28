package ro.avs.ourparking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.avs.fgca.model.BaseEntity;

@Getter
@Setter
@NoArgsConstructor
public class FuelType extends BaseEntity {
    private String name;

    public FuelType(String id, String name) {
        super(id);
        this.name = name;
    }
}
