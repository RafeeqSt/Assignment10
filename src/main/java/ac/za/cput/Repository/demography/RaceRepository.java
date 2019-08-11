package ac.za.cput.Repository.demography;

import ac.za.cput.Domain.demography.Race;
import ac.za.cput.Repository.Repository;

import java.util.Set;

public interface RaceRepository extends Repository<Race, Integer> {
    Set<Race> getAll();
}
