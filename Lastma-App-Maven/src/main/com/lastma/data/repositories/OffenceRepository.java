package main.com.lastma.data.repositories;

import main.com.lastma.data.models.Offence;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OffenceRepository extends MongoRepository<Offence, String> {
}
