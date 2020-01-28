package ro.avs.ourparking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.avs.fgca.model.BaseEntity;

@Getter
@Setter
@NoArgsConstructor
public class Role extends BaseEntity {
    private String role;

    public Role(String s, String role) {
        super(s);
        this.role = role;
    }
}
