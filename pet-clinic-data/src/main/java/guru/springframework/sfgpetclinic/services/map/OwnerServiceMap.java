package guru.springframework.sfgpetclinic.services.map;


import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {


    @Override
    public Set<Owner> findAll() {

        return super.findAll();
    }


    @Override
    public void deleteById(Long id) {

        super.deleteById(id);
    }


    @Override
    public Owner save(Long id, Owner owner) {

        return super.save(id, owner);
    }


    @Override
    public void delete(Owner owner) {

        super.delele(owner);
    }


    @Override
    public Owner findById(Long id) {

        return super.findById(id);
    }


    @Override
    public Owner save(Owner owner) {

        return super.save(owner.getId(), owner);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
