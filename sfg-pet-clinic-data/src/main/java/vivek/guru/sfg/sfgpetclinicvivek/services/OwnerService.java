package vivek.guru.sfg.sfgpetclinicvivek.services;

import vivek.guru.sfg.sfgpetclinicvivek.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(long id);

    Owner save(Owner owner);

    Set<Owner> findall();
}
