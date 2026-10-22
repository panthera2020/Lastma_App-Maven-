package main.com.lastma.services;

import main.com.lastma.dtos.requests.RegisterDriverRequest;
import main.com.lastma.dtos.responses.RegisterDriverResponse;

public interface DriverService {
    RegisterDriverResponse registerDriver(RegisterDriverRequest request);
}
