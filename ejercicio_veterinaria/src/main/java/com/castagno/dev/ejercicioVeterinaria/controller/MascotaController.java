
package com.castagno.dev.ejercicioVeterinaria.controller;

import com.castagno.dev.ejercicioVeterinaria.dto.MascotaDuenhoDTO;
import com.castagno.dev.ejercicioVeterinaria.model.Mascota;
import com.castagno.dev.ejercicioVeterinaria.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    
    @Autowired
    private IMascotaService mascoServ;
    
    //endpoint READ mascotas
    @GetMapping ("/mascota/traer")
    public List<Mascota> getMascotas() {
        return mascoServ.getMascota();
    }
    
    //endpoint CREATE mascota
    @PostMapping ("/mascota/crear")
    public String createMascota (@RequestBody Mascota mascota) {
        mascoServ.saveMascota(mascota);
        return "La mascota ha sido creada correctamente";
    }
    
    //endpoint DELETE mascota
    @DeleteMapping ("/mascota/borrar/{id_mascota}")
    public String deleteMascota(@PathVariable Long id_mascota) {
        mascoServ.deleteMascota(id_mascota);
        return "La mascota ha sido borrada con exito";
    }
    
    //endpoint UPDATE mascota
    @PutMapping ("/mascota/editar")
    public String updateMascota(@RequestBody Mascota mascota) {
        mascoServ.editMascota(mascota);
        return "La mascota ha sido editada correctamente";
    }
    
    //endpoint READ una mascota
    @GetMapping ("/mascota/traer/{id_mascota}")
    public Mascota getUnaMascota (@PathVariable Long id_mascota) {
        return mascoServ.findMascota(id_mascota);
    }
    
    //endpoint READ Caniches y Perros
    @GetMapping ("/mascota/traer/pyc")
    public List<Mascota> getPerrosYCaniches() {
        return mascoServ.getMascotaPerroYCaniche();
    }
    
    //endpoint READ mascota y duenho
    @GetMapping ("/mascotas/conDuenho")
    public List<MascotaDuenhoDTO> getMascotasConDuenho() {
        return mascoServ.getMascotaConDuenho();
    }
}
