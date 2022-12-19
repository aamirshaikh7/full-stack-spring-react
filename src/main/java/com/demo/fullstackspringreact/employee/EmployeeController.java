package com.demo.fullstackspringreact.employee;

import com.demo.fullstackspringreact.employee.Employee.Gender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("employees")
public class EmployeeController {

    @GetMapping
    public List<Employee> getAllEmployees() {
        return List.of(
                new Employee(
                        UUID.randomUUID(),
                        "John",
                        "doe",
                        "john@test.com",
                        Gender.MALE
                ),
                new Employee(
                        UUID.randomUUID(),
                        "Jane",
                        "doe",
                        "jane@test.com",
                        Gender.FEMALE),
                new Employee(
                        UUID.randomUUID(),
                        "James",
                        "doe",
                        "james@test.com",
                        Gender.MALE)
        );
    }

}
