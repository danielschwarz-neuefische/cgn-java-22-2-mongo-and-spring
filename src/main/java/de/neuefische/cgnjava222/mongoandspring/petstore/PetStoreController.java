package de.neuefische.cgnjava222.mongoandspring.petstore;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/pets")
class PetStoreController {

    private final PetStoreService service;

    PetStoreController(PetStoreService service) {
        this.service = service;
    }

    @GetMapping
    List<Pet> getPets() {
        return service.getPets();
    }

    @PutMapping
    Pet putPet(@RequestBody String petName) {
        return service.save(petName);
    }

}
