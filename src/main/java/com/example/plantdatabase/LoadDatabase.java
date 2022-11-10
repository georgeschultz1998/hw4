package com.example.plantdatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(PlantRepository repository) {

        return args -> {
            // Populates H2 database for testing purposes
            repository.save(new Plant("Redwood", "Sequoia sempervirens", 7, 9, 0));
            repository.save(new Plant("Loblolly Pine", "Pinus taeda", 6, 9, 0));
            repository.save(new Plant("Sweetgum", "Liquidambar styraciflua", 5, 9, 0));
            repository.save(new Plant("Tickseed", "Coreopsis grandiflora", 4, 10, 1));
            repository.save(new Plant("Sweet William", "Dianthus barbatus", 3, 9, 1));
            repository.save(new Plant("Bleeding Heart", "Dicentra spectabilis", 3, 9, 1));


        };
    }
}