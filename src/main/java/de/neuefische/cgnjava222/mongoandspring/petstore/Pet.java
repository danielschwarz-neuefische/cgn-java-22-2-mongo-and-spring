package de.neuefische.cgnjava222.mongoandspring.petstore;

import org.springframework.data.annotation.Id;

public record Pet(
        @Id String id,
        String name
) {
}
