package ac.za.cput.Controller.User;

import ac.za.cput.Domain.demography.Gender;
import ac.za.cput.Domain.demography.Race;
import ac.za.cput.Domain.user.Employee;
import ac.za.cput.Domain.user.EmployeeGender;
import ac.za.cput.Factory.demography.GenderFactory;
import ac.za.cput.Factory.demography.RaceFactory;
import ac.za.cput.Factory.user.EmployeeFactory;
import ac.za.cput.Factory.user.EmployeeGenderFactory;
import ac.za.cput.Service.demography.GenderService;
import ac.za.cput.Service.demography.RaceService;
import ac.za.cput.Service.demography.impl.GenderServiceImpl;
import ac.za.cput.Service.demography.impl.RaceServiceImpl;
import ac.za.cput.Service.user.EmployeeGenderService;
import ac.za.cput.Service.user.EmployeeService;
import ac.za.cput.Service.user.impl.EmployeeGenderServiceImpl;
import ac.za.cput.Service.user.impl.EmployeeServiceImpl;

public class EmployeeController {

    private EmployeeService employeeService = EmployeeServiceImpl.getService();
    private EmployeeGenderService employeeGenderService = EmployeeGenderServiceImpl.getService();
    private RaceService raceService = RaceServiceImpl.getService();
    private GenderService genderService = GenderServiceImpl.getService();

    public void create(int empId, String firstName, String lastName, int genderId, int raceId) {

        Employee employee = EmployeeFactory.getEmployee(empId, firstName, lastName);
        employeeService.create(employee);

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(empId, genderId);
        employeeGenderService.create(employeeGender);

        Race race = RaceFactory.buildRace(raceId, "Race");
        raceService.create(race);

        Gender gender = GenderFactory.buildGender(genderId, "None");
        genderService.create(gender);
    }
}
