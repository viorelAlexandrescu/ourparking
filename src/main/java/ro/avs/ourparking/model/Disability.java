package ro.avs.ourparking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Disability extends BaseEntity {
    private String disabilityName;

    public Disability(String id, String disabilityName) {
        super(id);
        this.disabilityName = disabilityName;
    }
}
