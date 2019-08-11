package ac.za.cput.Repository.user;

import ac.za.cput.Domain.user.EmployeeGender;
import ac.za.cput.Repository.Repository;

import java.util.Set;

public interface EmployeeGenderRepository extends Repository<EmployeeGender, Integer> {
    Set<EmployeeGender> getAll();
}