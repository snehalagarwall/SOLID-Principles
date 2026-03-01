package org.example;

import org.example.TrackExecutionTime;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @TrackExecutionTime
    public void heavyOperation() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Heavy operation completed");
    }
}
