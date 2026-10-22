package main.com.lastma.data.repositories;

import main.com.lastma.data.models.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
