package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee=new Employee();
		employee.setFirstName("Thushani");
		employee.setLastName("Chandrasekara");
		employee.setEmailId("9thushani7@gmail.com");
		employeeRepository.save(employee);

		// Use shift-f6 to rename a variable at once
		Employee employee1=new Employee();
		employee1.setFirstName("Asitha");
		employee1.setLastName("Divisekara");
		employee1.setEmailId("9asitha7@gmail.com");
		employeeRepository.save(employee1);
	}
}
