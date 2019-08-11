package ac.za.cput.Service.demography;

import ac.za.cput.Domain.demography.Race;
import ac.za.cput.Service.Service;

import java.util.Set;

public interface RaceService extends Service<Race,Integer> {
    Set<Race> getAll();
}
