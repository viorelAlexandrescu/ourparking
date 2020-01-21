package ro.avs.ourparking.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
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
        return rolesDAO.getAllRoles();
    }

    public String getAllRolesAsJSONString() throws ExecutionException, InterruptedException, JsonProcessingException {
        List<Role> roles = getAllRoles();
        ArrayNode array = objectMapper.createArrayNode();
        for (Role role : roles) {
            ObjectNode objectNode = objectMapper.createObjectNode();
            objectNode.put("id", role.getId());
            objectNode.put("role", role.getRole());
            array.add(objectNode);
        }
        return objectMapper.writeValueAsString(array);
    }
}
