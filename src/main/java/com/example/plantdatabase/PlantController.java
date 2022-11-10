package com.example.plantdatabase;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/plants")

class PlantController {
    private PlantService plantService;

    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }

    @GetMapping("/searchComName")
    public ResponseEntity<List<Plant>> searchComName(@RequestParam("query") String query){
        return ResponseEntity.ok(plantService.searchComName(query));
    }

    @GetMapping("/searchSciName")
    public ResponseEntity<List<Plant>> searchSciName(@RequestParam("query") String query){
        return ResponseEntity.ok(plantService.searchSciName(query));
    }

    @GetMapping("/searchPlantType")
    public ResponseEntity<List<Plant>> searchPlantType(@RequestParam("query") Integer query){
        return ResponseEntity.ok(plantService.searchPlantType(query));
    }

    @GetMapping("/searchZone")
    public ResponseEntity<List<Plant>> searchZone(@RequestParam("query") Integer query){
        return ResponseEntity.ok(plantService.searchZone(query));
    }

    @GetMapping("/creatPlant")
    public Plant createPlant(@RequestBody Plant plant){
        return plantService.createPlant(plant);
    }
}

