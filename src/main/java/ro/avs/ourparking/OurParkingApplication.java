package ro.avs.ourparking;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import ro.avs.ourparking.utility.ApplicationProperties;

import java.io.FileInputStream;
import java.io.IOException;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties(ApplicationProperties.class)
public class OurParkingApplication {

    private static ApplicationProperties applicationProperties;

    @Autowired
    public OurParkingApplication(ApplicationProperties applicationProperties) {
        OurParkingApplication.applicationProperties = applicationProperties;
    }

    public static void main(String[] args) {
        run(OurParkingApplication.class, args);

        try {
            FileInputStream serviceAccount = new FileInputStream(applicationProperties.getApiKeyPath());
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl(applicationProperties.getDbUrl())
                    .build();

            if (FirebaseApp.getApps().isEmpty()) {
                FirebaseApp.initializeApp(options);
            }

            System.out.println("Successfully configured connection to Firebase.");
        } catch (IOException e) {
            throw new IllegalArgumentException("Firebase API key not set");
        }
    }

}
