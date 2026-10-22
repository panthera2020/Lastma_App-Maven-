package main.com.lastma.data.repositories;

import main.com.lastma.data.models.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehicleRepository extends MongoRepository<Vehicle, String> {
}
