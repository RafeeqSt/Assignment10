package ac.za.cput.Factory.user;

import ac.za.cput.Domain.user.EmployeeGender;

public class EmployeeGenderFactory {

    public static EmployeeGender buildEmployeeGender(int empId, int genderId){

        return new EmployeeGender().employeeGender(genderId, empId);
    }
}
