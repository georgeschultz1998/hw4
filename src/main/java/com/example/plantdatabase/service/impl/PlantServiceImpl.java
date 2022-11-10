package com.example.plantdatabase.service.impl;

import com.example.plantdatabase.Plant;
import com.example.plantdatabase.PlantRepository;
import com.example.plantdatabase.service.PlantService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantServiceImpl implements PlantService {

    private PlantRepository plantRepository;

    public PlantServiceImpl(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    @Override
    public List<Plant> searchPlants(String query) {
       List<Plant> plants = plantRepository.searchPlants(query);
       return plants;
    }

    @Override
    public Plant createPlant(Plant plant) {
        return plantRepository.save(plant);
    }
}
