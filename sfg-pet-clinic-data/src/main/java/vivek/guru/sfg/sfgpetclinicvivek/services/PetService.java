package vivek.guru.sfg.sfgpetclinicvivek.services;

import vivek.guru.sfg.sfgpetclinicvivek.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(long id);

    Pet save(Pet owner);

    Set<Pet> findall();
}
