package vivek.guru.sfg.sfgpetclinicvivek.services;

import vivek.guru.sfg.sfgpetclinicvivek.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(long id);

    Vet save(Vet owner);

    Set<Vet> findall();
}
