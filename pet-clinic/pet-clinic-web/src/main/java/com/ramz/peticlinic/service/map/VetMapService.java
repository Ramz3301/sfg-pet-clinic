package com.ramz.peticlinic.service.map;

import com.ramz.petclinic.model.Specialty;
import com.ramz.petclinic.model.Vet;
import com.ramz.peticlinic.service.SpecialtyService;
import org.springframework.stereotype.Service;
import com.ramz.peticlinic.service.VetService;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long>
        implements VetService {

    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {

        if (object.getSpecialties().size() > 0) {
            object.getSpecialties().forEach(specialty -> {
                if (specialty.getId() == null) {
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }

        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
