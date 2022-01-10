package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    //all crud database methods

}
