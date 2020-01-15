package ro.avs.ourparking;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
public class HomeController {

    @Autowired
    ObjectMapper objectMapper;

    @GetMapping("/home")
    public String getHome() throws IOException, ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        // asynchronously retrieve all users
        ApiFuture<QuerySnapshot> query = db.collection("Roles").get();
        QuerySnapshot querySnapshot = query.get();
        List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
        ArrayNode array = objectMapper.createArrayNode();
        for (QueryDocumentSnapshot document : documents) {
            ObjectNode objectNode = objectMapper.createObjectNode();
            objectNode.put("id", document.getId());
            objectNode.put("role", document.getString("role"));
            array.add(objectNode);
        }
        return objectMapper.writeValueAsString(array);
    }
}
