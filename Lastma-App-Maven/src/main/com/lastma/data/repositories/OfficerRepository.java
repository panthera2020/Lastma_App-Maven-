package main.com.lastma.data.repositories;

import main.com.lastma.data.models.Officer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OfficerRepository extends MongoRepository<Officer, String> {
}
