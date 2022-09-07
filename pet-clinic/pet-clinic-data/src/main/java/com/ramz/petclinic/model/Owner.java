package com.ramz.petclinic.model;

import lombok.Builder;

import java.util.Set;

//@Builder
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

}
