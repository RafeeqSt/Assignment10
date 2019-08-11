package ac.za.cput.factory.demography;

import ac.za.cput.Domain.demography.Gender;
import ac.za.cput.Factory.demography.GenderFactory;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {
    @Test
    public void getGender() {

        Gender gender = GenderFactory.buildGender(1, "M");
        Assert.assertNotNull(gender);

    }
}
