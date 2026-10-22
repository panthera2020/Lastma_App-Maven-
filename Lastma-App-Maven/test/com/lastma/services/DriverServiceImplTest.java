package com.lastma.services;

import com.lastma.dtos.requests.RegisterDriverRequest;
import com.lastma.dtos.responses.RegisterDriverResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverServiceImplTest {
    private DriverService driverService = new DriverServiceImpl();

    @Test
    public void testThatWhenIRegisterDriver_IdIsGenerated() {
        RegisterDriverRequest request = new RegisterDriverRequest();
        request.setFullName("John Doe");
        request.setPhoneNumber("1234567890");
        request.setPassword("password");
        request.setEmail("john.doe@lastma");
        RegisterDriverResponse response = driverService.registerDriver(request);
        assertNotNull(response);
        assertEquals("John Doe", response.getFullName());
    }
}