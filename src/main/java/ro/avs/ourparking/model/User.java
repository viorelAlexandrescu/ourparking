package ro.avs.ourparking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import ro.avs.fgca.model.BaseEntity;

@Data
@AllArgsConstructor
public class User extends BaseEntity {
    private String email;
    private String password;
    private String phoneNumber;
    private String name;
}
