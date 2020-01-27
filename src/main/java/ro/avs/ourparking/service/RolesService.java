package ro.avs.ourparking.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.avs.ourparking.dao.RolesDAO;
import ro.avs.ourparking.model.Role;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class RolesService {

    private RolesDAO rolesDAO;
    private ObjectMapper objectMapper;

    @Autowired
    public RolesService(RolesDAO rolesDAO, ObjectMapper objectMapper) {
        this.rolesDAO = rolesDAO;
        this.objectMapper = objectMapper;
    }

    public List<Role> getAllRoles() throws ExecutionException, InterruptedException {
        return rolesDAO.getAllDocumentsParsedFromCollection();
    }

    public String getAllRolesAsJSONString() throws ExecutionException, InterruptedException, JsonProcessingException {
        return objectMapper.writeValueAsString(getAllRoles());
    }

    public void addRole(Role role) {
        rolesDAO.addDocument(role);
    }

    public Role getRoleById(String id) throws ExecutionException, InterruptedException {
        return rolesDAO.getDocumentById(id);
    }
}
