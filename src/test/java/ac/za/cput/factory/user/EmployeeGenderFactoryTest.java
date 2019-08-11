package ac.za.cput.factory.user;

import ac.za.cput.Domain.user.EmployeeGender;
import ac.za.cput.Factory.user.EmployeeGenderFactory;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeGenderFactoryTest {
    @Test
    public void buildEmployeeGender() {

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(1, 1);
        Assert.assertNotNull(employeeGender);

    }
}
