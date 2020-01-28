package ro.avs.ourparking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.avs.fgca.service.BaseService;
import ro.avs.ourparking.dao.ParkingSpaceDAO;
import ro.avs.ourparking.model.ParkingSpace;

import java.util.concurrent.ExecutionException;

@Service
public class ParkingSpaceService extends BaseService<ParkingSpace> {

    @Autowired
    public ParkingSpaceService(ParkingSpaceDAO dao) {
        super(dao);
    }

    public void changeParkingSpaceValidity(String parkingSpaceId, Boolean valid) {
        try {
            ParkingSpace parkingSpace = getById(parkingSpaceId);
            parkingSpace.setValid(valid);
            updateDocument(parkingSpace);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void changeParkingSpaceVacancy(String parkingSpaceId, Boolean vacant) {
        try {
            ParkingSpace parkingSpace = getById(parkingSpaceId);
            parkingSpace.setVacant(vacant);
            updateDocument(parkingSpace);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
