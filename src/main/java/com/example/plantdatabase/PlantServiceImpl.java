package com.example.plantdatabase;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantServiceImpl implements PlantService {

    private PlantRepository plantRepository;

    public PlantServiceImpl(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    @Override
    public List<Plant> searchComName(String query) {
       List<Plant> plants = plantRepository.searchComName(query);
       return plants;
    }

    @Override
    public List<Plant> searchSciName(String query) {
       List<Plant> plants = plantRepository.searchSciName(query);
       return plants;
    }

    @Override
    public List<Plant> searchPlantType(String query) {
       List<Plant> plants = plantRepository.searchPlantType(query);
       return plants;
    }

    @Override
    public Plant createPlant(Plant plant) {
        return plantRepository.save(plant);
    }
}
