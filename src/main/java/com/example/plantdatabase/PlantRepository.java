package com.example.plantdatabase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlantRepository
        extends JpaRepository<Plant, Long> {
    @Query("SELECT p FROM Plant p WHERE " +
            "p.comName LIKE CONCAT('%',:query, '%')")
    List<Plant> searchComName(String query);

    @Query("SELECT p FROM Plant p WHERE " +
            "p.sciName LIKE CONCAT('%',:query, '%')")
    List<Plant> searchSciName(String query);

    @Query("SELECT p FROM Plant p WHERE " +
            "p.plantType LIKE CONCAT('%',:query, '%')")
    List<Plant> searchPlantType(Integer query);

    @Query("SELECT p FROM Plant p WHERE " +
            ":query >= p.minZone AND :query <= p.maxZone")
    List<Plant> searchZone(Integer query);

}