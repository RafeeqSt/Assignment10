package ac.za.cput.Service.user;

import ac.za.cput.Domain.user.Employee;
import ac.za.cput.Service.Service;

import java.util.Set;

public interface EmployeeService extends Service<Employee, Integer> {
    Set<Employee> getAll();
}
