package ac.za.cput.Repository.demography;

import ac.za.cput.Domain.demography.Gender;
import ac.za.cput.Repository.Repository;

import java.util.Set;

public interface GenderRepository extends Repository<Gender, Integer> {
    Set<Gender> getAll();
}
