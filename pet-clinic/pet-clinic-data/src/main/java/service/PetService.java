package service;

import com.ramz.petclinic.model.Owner;
import com.ramz.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
