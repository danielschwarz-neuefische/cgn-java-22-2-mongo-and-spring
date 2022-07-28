package de.neuefische.cgnjava222.mongoandspring.petstore;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
class PetStoreService {

    private final PetRepository repo;

    PetStoreService(PetRepository repo) {
        this.repo = repo;
    }

    public List<Pet> getPets() {
        return repo.findAll();
    }

    public Pet save(String petName) {
        return repo.save(new Pet(
                UUID.randomUUID().toString(),
                petName
        ));
    }
}
