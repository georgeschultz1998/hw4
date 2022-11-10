package com.example.plantdatabase.service;
import com.example.plantdatabase.Plant;

import java.util.List;

public interface PlantService {
    List<Plant> searchPlants(String query);

    Plant createPlant(Plant plant);
}
