package ac.za.cput.factory.user;

import ac.za.cput.Domain.user.Employee;
import ac.za.cput.Factory.user.EmployeeFactory;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeFactoryTest {
    @Test
    public void getEmployee() {
        Employee employee = EmployeeFactory.getEmployee(1, "Jhon", "Doe");
        Assert.assertNotNull(employee);
    }
}
