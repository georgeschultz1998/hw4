package com.example.plantdatabase;
import java.util.List;

public interface PlantService {
    List<Plant> searchComName(String query);

    List<Plant> searchSciName(String query);

    List<Plant> searchPlantType(Integer query);

    List<Plant> searchZone(Integer query);
}
