package ro.avs.ourparking.dao;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Repository;
import ro.avs.ourparking.model.Role;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Repository
public class RolesDAO {

    public List<Role> getAllRoles() throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<QuerySnapshot> query = db.collection("Roles").get();
        QuerySnapshot querySnapshot = query.get();
        List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
        List<Role> roles = new ArrayList<>(documents.size());
        for (QueryDocumentSnapshot document : documents) {
            Role role = new Role(
                    document.getId(),
                    document.getString("role")
            );
            roles.add(role);
        }
        return roles;
    }

}
