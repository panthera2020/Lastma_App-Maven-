package main.com.lastma.data.repositories;

import main.com.lastma.data.models.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DriverRepository extends MongoRepository<Driver, String> {
}
