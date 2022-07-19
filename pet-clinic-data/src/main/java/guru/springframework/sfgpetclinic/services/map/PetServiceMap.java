package guru.springframework.sfgpetclinic.services.map;


import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;


public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {


    @Override
    public Set<Pet> findAll() {

        return super.findAll();
    }


    @Override
    public void deleteById(Long id) {

        super.deleteById(id);
    }


    @Override
    public Pet save(Long id, Pet pet) {

        return super.save(id, pet);
    }


    @Override
    public void delete(Pet pet) {

        super.delele(pet);
    }


    @Override
    public Pet findById(Long id) {

        return super.findById(id);
    }


    @Override
    public Pet save(Pet pet) {

        return super.save(pet.getOwner().getId(), pet);
    }
}
