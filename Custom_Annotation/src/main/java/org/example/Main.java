package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context =
                SpringApplication.run(Main.class,args);

        EmployeeService service = context.getBean(EmployeeService.class);
        service.heavyOperation();
    }
}