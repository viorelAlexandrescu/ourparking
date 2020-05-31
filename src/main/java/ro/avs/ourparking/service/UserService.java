package ro.avs.ourparking.service;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import ro.avs.ourparking.model.User;

public class UserService {

    public User getById(String id) throws FirebaseAuthException {
        UserRecord userRecord = FirebaseAuth.getInstance().getUser(id);
        return new User(userRecord.getEmail());
    }

    public void save(User user) throws FirebaseAuthException {
        UserRecord.CreateRequest request = new UserRecord.CreateRequest()
                .setEmail(user.getEmail())
                .setEmailVerified(false)
                .setPassword(user.getPassword())
                .setPhoneNumber(user.getPhoneNumber())
                .setDisplayName(user.getName())
                .setDisabled(false);

        UserRecord userRecord = FirebaseAuth.getInstance().createUser(request);
    }
}
