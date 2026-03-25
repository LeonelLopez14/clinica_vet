
package com.castagno.dev.ejercicioVeterinaria.service;

import com.castagno.dev.ejercicioVeterinaria.dto.MascotaDuenhoDTO;
import com.castagno.dev.ejercicioVeterinaria.model.Mascota;
import com.castagno.dev.ejercicioVeterinaria.repository.IMascotaRespoitory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService {
    
    @Autowired
    private IMascotaRespoitory mascoRepo;

    @Override
    public List<Mascota> getMascota() {
        List<Mascota> listaMascotas = mascoRepo.findAll();
        return listaMascotas;
    }

    @Override
    public void saveMascota(Mascota mascota) {
        mascoRepo.save(mascota);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        mascoRepo.deleteById(id_mascota);
    }

    @Override
    public void editMascota(Mascota mascota) {
        this.saveMascota(mascota);
    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        Mascota masco = mascoRepo.findById(id_mascota).orElse(null);
        return masco;
    }

    @Override
    public List<Mascota> getMascotaPerroYCaniche() {
        return this.getMascota()
            .stream()
            .filter(mascota -> 
                mascota.getEspecie().contains("Perro") &&
                mascota.getRaza().contains("Caniche")
            )
            .toList();
}

    @Override
    public List<MascotaDuenhoDTO> getMascotaConDuenho() {
        return this.getMascota()
                .stream()
                .filter(mascota -> mascota.getUnDuenho() != null)
                .map(mascota -> new MascotaDuenhoDTO(
                        mascota.getNombre_mascota(),
                        mascota.getEspecie(),
                        mascota.getRaza(),
                        mascota.getUnDuenho().getNombre_duenho(),
                        mascota.getUnDuenho().getApellido_duenho()
                ))
                .toList();
    }
    
}
