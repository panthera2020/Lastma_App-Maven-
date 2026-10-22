package main.com.lastma.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Officer {
    private String fullName;
    private String officerNumber;
    @Id
    private String id;
    private boolean isActive = true;
    private String password;
}
