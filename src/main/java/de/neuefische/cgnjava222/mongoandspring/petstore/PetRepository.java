package de.neuefische.cgnjava222.mongoandspring.petstore;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PetRepository extends MongoRepository<Pet, String> {

    List<Pet> findAllByName(String name);

}
