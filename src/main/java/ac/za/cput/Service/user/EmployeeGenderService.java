package ac.za.cput.Service.user;

import ac.za.cput.Domain.user.EmployeeGender;
import ac.za.cput.Service.Service;

import java.util.Set;

public interface EmployeeGenderService extends Service<EmployeeGender, Integer> {
    Set<EmployeeGender> getAll();
}