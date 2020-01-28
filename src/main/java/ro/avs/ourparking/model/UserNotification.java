package ro.avs.ourparking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.avs.fgca.model.BaseEntity;

@Getter
@Setter
@NoArgsConstructor
public class UserNotification extends BaseEntity {
    private String reservationId;
    private UserNotificationStatus status;

    public UserNotification(String id, String reservationId, UserNotificationStatus status) {
        super(id);
        this.reservationId = reservationId;
        this.status = status;
    }
}
