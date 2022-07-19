package guru.springframework.sfgpetclinic.services.map;


import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;


public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {


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
}
