package ac.za.cput.Service.demography.impl;

import ac.za.cput.Domain.demography.Race;
import ac.za.cput.Repository.demography.RaceRepository;
import ac.za.cput.Repository.demography.impl.RaceRepositoryImpl;
import ac.za.cput.Service.demography.RaceService;
import java.util.Set;

public class RaceServiceImpl implements RaceService{

    private static RaceServiceImpl service = null;
    private RaceRepository repository;

    public RaceServiceImpl() {
        repository = RaceRepositoryImpl.getRaceRepository();
    }

    public static RaceServiceImpl getService(){

        if(service == null){
            return new RaceServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Race> getAll() {
        return repository.getAll();
    }

    @Override
    public Race create(Race race) {
        return repository.create(race);
    }

    @Override
    public Race read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Race update(Race race) {
        return repository.update(race);
    }

    @Override
    public void delete(Integer integer) {
        repository.delete(integer);
    }
}
