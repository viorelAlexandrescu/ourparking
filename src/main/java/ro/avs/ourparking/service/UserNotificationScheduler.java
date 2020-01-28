package ro.avs.ourparking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ro.avs.ourparking.model.Reservation;
import ro.avs.ourparking.model.UserNotification;
import ro.avs.ourparking.model.UserNotificationStatus;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Component
public class UserNotificationScheduler {

    private UserNotificationService userNotificationService;
    private ReservationService reservationService;

    @Autowired
    public UserNotificationScheduler(UserNotificationService userNotificationService, ReservationService reservationService) {
        this.userNotificationService = userNotificationService;
        this.reservationService = reservationService;
    }

    // once every two minutes
    @Scheduled(fixedRate = 120000)
    public void checkForMail() {
        try {
            List<UserNotification> userNotificationList = userNotificationService.getAll();
            for (UserNotification userNotification : userNotificationList) {
                if (userNotification.getStatus().equals(UserNotificationStatus.PENDING)) {
                    Reservation reservation = reservationService.getById(userNotification.getReservationId());

                }
            }
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
