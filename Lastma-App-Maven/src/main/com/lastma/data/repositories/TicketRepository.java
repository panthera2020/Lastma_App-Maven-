package main.com.lastma.data.repositories;

import main.com.lastma.data.models.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String> {
}
