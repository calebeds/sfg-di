package com.springframework.pets;

import org.springframework.stereotype.Service;

public class PetServiceFactory {
    public PetService getPetService(String petType) {
        switch (petType) {
            case "dog":
                return new DogService();
            case "cat":
                return new CatService();
            default:
                return new CatService();
        }
    }
}
