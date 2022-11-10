package com.example.plantdatabase;

public class PlantNotFoundException extends RuntimeException {
    PlantNotFoundException(Long id){
        super("Could not find plant with id= " + id);
    }
}
