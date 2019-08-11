package ac.za.cput.repository.demography.impl;

import ac.za.cput.Domain.demography.Race;
import ac.za.cput.Factory.demography.RaceFactory;
import ac.za.cput.Repository.demography.impl.RaceRepositoryImpl;
import ac.za.cput.Repository.demography.RaceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class RaceRepositoryImplTest {
    private RaceRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepositoryImpl.getRaceRepository();
    }


    @Test
    public void getAll() {

        Set<Race> employeeSet = repository.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        Race employee = RaceFactory.buildRace(1,"Rainbow");

        repository.create(employee);

        Race inRepo = repository.read(employee.getRaceNum());

        Assert.assertNotNull(inRepo);

    }

    @Test
    public void read() {

        Race employee = RaceFactory.buildRace(1,"Rainbow");

        repository.create(employee);

        Race inRepo = repository.read(employee.getRaceNum());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void update() {

        Race employee = RaceFactory.buildRace(1,"Rainbow");

        repository.create(employee);
        Race inRepo = repository.read(employee.getRaceNum());

        employee.setDesc("Not Riaz");

        repository.update(employee);

        Assert.assertEquals(employee.getRaceNum(), inRepo.getRaceNum());

    }

    @Test
    public void delete() {

        Race employee = RaceFactory.buildRace(1,"Rainbow");

        repository.create(employee);

        Race inRepo = repository.read(employee.getRaceNum());

        Assert.assertNotNull(inRepo);

        repository.delete(employee.getRaceNum());

        Race deleted = repository.read(employee.getRaceNum());

        Assert.assertNull(deleted);

    }
}
