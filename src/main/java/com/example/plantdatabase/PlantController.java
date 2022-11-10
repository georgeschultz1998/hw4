package com.example.plantdatabase;

import java.util.List;

import com.example.plantdatabase.service.PlantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/plants")

class PlantController {
    private PlantService plantService;

    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Plant>> searchPlants(@RequestParam("query") String query){
        return ResponseEntity.ok(plantService.searchPlants(query));
    }

    public Plant createPlant(@RequestBody Plant plant){
        return plantService.createPlant(plant);
    }
}

