package ac.za.cput.Service.demography;

import ac.za.cput.Domain.demography.Gender;
import ac.za.cput.Service.Service;

import java.util.Set;

public interface GenderService extends Service<Gender, Integer> {
    Set<Gender> getAll();
}
