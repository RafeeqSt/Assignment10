package ac.za.cput.Repository.user;

import ac.za.cput.Domain.user.Employee;
import ac.za.cput.Repository.Repository;

import java.util.Set;

public interface EmployeeRepository extends Repository<Employee, Integer> {
    Set<Employee> getAll();
}
