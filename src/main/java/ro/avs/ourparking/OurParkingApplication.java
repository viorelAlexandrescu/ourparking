package ro.avs.ourparking;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.IOException;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class OurParkingApplication {

    public static void main(String[] args) {
        run(OurParkingApplication.class, args);

        try {
            String apiKeyPath = System.getenv("firebase_api_key");
            FileInputStream serviceAccount = new FileInputStream(apiKeyPath);
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://parkingmanagement-e0ab0.firebaseio.com")
                    .build();

            if (FirebaseApp.getApps().isEmpty()) {
                FirebaseApp.initializeApp(options);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
