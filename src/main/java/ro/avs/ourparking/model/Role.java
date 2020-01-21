package ro.avs.ourparking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Role {

    private String id;
    private String role;

    public Role(String id, String role) {
        this.id = id;
        this.role = role;
    }
}
