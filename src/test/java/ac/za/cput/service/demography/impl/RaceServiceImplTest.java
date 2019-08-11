package ac.za.cput.service.demography.impl;

import ac.za.cput.Domain.demography.Race;
import ac.za.cput.Factory.demography.RaceFactory;
import ac.za.cput.Service.demography.impl.RaceServiceImpl;
import ac.za.cput.Service.demography.RaceService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class RaceServiceImplTest {
    private RaceService service;

    @Before
    public void setUp() throws Exception {
        this.service = RaceServiceImpl.getService();
    }

    @Test
    public void getAll() {

        Set<Race> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);
    }

    @Test
    public void create() {

        Race employee = RaceFactory.buildRace(1,"Rainbow");
        service.create(employee);
        Race inRepo = service.read(employee.getRaceNum());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void read() {

        Race employee = RaceFactory.buildRace(1,"Rainbow");
        service.create(employee);
        Race inRepo = service.read(employee.getRaceNum());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void update() {

        Race employee = RaceFactory.buildRace(1,"Rainbow");
        service.create(employee);
        Race inRepo = service.read(employee.getRaceNum());
        employee.setDesc("Thabo");
        service.update(employee);
        Assert.assertEquals(employee.getRaceNum(), inRepo.getRaceNum());

    }

    @Test
    public void delete() {

        Race employee = RaceFactory.buildRace(1,"Rainbow");
        service.create(employee);
        Race inRepo = service.read(employee.getRaceNum());
        Assert.assertNotNull(inRepo);
        service.delete(employee.getRaceNum());
        Race deleted = service.read(employee.getRaceNum());
        Assert.assertNull(deleted);
    }
}
