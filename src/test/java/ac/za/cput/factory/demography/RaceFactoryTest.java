package ac.za.cput.factory.demography;

import ac.za.cput.Domain.demography.Race;
import ac.za.cput.Factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Test;

public class RaceFactoryTest {
    @Test
    public void buildRace() {

        Race race = RaceFactory.buildRace(1, "Rainbow");
        Assert.assertNotNull(race);

    }
}
