
package com.castagno.dev.ejercicioVeterinaria.service;

import com.castagno.dev.ejercicioVeterinaria.model.Duenho;
import com.castagno.dev.ejercicioVeterinaria.repository.IDuenhoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenhoService implements IDuenhoService{
    
    @Autowired
    private IDuenhoRepository duenhoRepo;

    @Override
    public List<Duenho> getDuenhos() {
        List<Duenho> listaDuenhos =  duenhoRepo.findAll();
        return listaDuenhos;
    }

    @Override
    public void saveDuenho(Duenho duenho) {
        duenhoRepo.save(duenho);
    }

    @Override
    public void deleteDuenho(Long id_duenho) {
        duenhoRepo.deleteById(id_duenho);
    }

    @Override
    public void editDuenho(Duenho duenho) {
        this.saveDuenho(duenho);
    }

    @Override
    public Duenho findDuenho(Long id_duenho) {
        Duenho duenho = duenhoRepo.findById(id_duenho).orElse(null);
        return duenho;
    }
    
}
