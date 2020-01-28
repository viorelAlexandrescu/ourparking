package ro.avs.ourparking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.avs.fgca.model.BaseEntity;

@Getter
@Setter
@NoArgsConstructor
public class UserDisability extends BaseEntity {

    private String userId;
    private String disabilityId;

    public UserDisability(String id, String userId, String disabilityId) {
        super(id);
        this.userId = userId;
        this.disabilityId = disabilityId;
    }
}
