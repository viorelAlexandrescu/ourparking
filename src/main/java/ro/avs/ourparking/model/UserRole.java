package ro.avs.ourparking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.avs.fgca.model.BaseEntity;

@Getter
@Setter
@NoArgsConstructor
public class UserRole extends BaseEntity {

    private String roleId;
    private String userId;

    public UserRole(String id, String roleId, String userId) {
        super(id);
        this.roleId = roleId;
        this.userId = userId;
    }
}
