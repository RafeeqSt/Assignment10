package ac.za.cput.Service.user.impl;

import ac.za.cput.Domain.user.EmployeeGender;
import ac.za.cput.Repository.user.EmployeeGenderRepository;
import ac.za.cput.Repository.user.impl.EmployeeGenderRepositoryImpl;
import ac.za.cput.Service.user.EmployeeGenderService;

import java.util.Set;

public class EmployeeGenderServiceImpl implements EmployeeGenderService{
    private static EmployeeGenderServiceImpl service = null;
    private EmployeeGenderRepository repository;

    public EmployeeGenderServiceImpl() {
        repository = EmployeeGenderRepositoryImpl.getEmployeeGenderRepository();
    }

    public static EmployeeGenderServiceImpl getService(){

        if(service == null){
            return new EmployeeGenderServiceImpl();
        }
        return service;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return repository.getAll();
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return repository.create(employeeGender);
    }

    @Override
    public EmployeeGender read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return repository.update(employeeGender);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}
