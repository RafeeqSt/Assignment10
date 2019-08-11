package ac.za.cput.controller;

import ac.za.cput.Controller.User.EmployeeController;
import ac.za.cput.Domain.demography.Gender;
import ac.za.cput.Domain.demography.Race;
import ac.za.cput.Domain.user.Employee;
import ac.za.cput.Domain.user.EmployeeGender;
import ac.za.cput.Factory.demography.GenderFactory;
import ac.za.cput.Factory.demography.RaceFactory;
import ac.za.cput.Factory.user.EmployeeFactory;
import ac.za.cput.Factory.user.EmployeeGenderFactory;
import org.junit.Before;
import org.junit.Test;

public class EmployeeControllerTest {
    private EmployeeController employeeController;


    @Before
    public void setUp() throws Exception {
        employeeController = new EmployeeController();
    }

    @Test
    public void create() {

        Gender gender = GenderFactory.buildGender(1, "M");
        Race race = RaceFactory.buildRace(1,"Rainbow");
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(1, 1);
        Employee employee = EmployeeFactory.getEmployee(1, "Jhon", "Doe");

        employeeController.create(employee.getEmpNumber(), employee.getEmpLastName(),employee.getEmpLastName(), gender.getId(),race.getRaceNum());
    }
}
