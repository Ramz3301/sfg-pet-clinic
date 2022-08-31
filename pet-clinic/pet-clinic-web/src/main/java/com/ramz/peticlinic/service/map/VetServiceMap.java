package com.ramz.peticlinic.service.map;

import com.ramz.petclinic.model.Vet;
import org.springframework.stereotype.Service;
import com.ramz.peticlinic.service.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long>
        implements VetService {
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
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
