package ro.avs.ourparking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Role {

    @JsonProperty("id")
    private String id;
    @JsonProperty("role")
    private String role;

    public Role(String id, String role) {
        this.id = id;
        this.role = role;
    }
}
