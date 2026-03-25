
package com.castagno.dev.ejercicioVeterinaria.controller;

import com.castagno.dev.ejercicioVeterinaria.model.Duenho;
import com.castagno.dev.ejercicioVeterinaria.service.IDuenhoService;
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
public class DuenhoController {
    
    @Autowired
    private IDuenhoService duenhoServ;
    
    
    //endpoint READ duenhos
    @GetMapping ("/duenho/traer")
    public List<Duenho> getDuenhos() {
    return duenhoServ.getDuenhos();
}
    
    //endpoint CREATE duenhos
    @PostMapping ("/duenho/crear")
    public String createDuenho (@RequestBody Duenho duenho) {
        duenhoServ.saveDuenho(duenho);
        return "El duenho ah sido creado correctamente";
    }
    
    //endpoint DELETE duenho
    @DeleteMapping ("/duenho/borrar/{id_duenho}")
    public String deleteDuenho (@PathVariable Long id_duenho) {
        duenhoServ.deleteDuenho(id_duenho);
        return "El duenho ha sido borrado correctamente";
    }
    
    //endpoint  UPDATE duenho
    @PutMapping ("/duenho/editar")
    public String updateDuenho (@RequestBody Duenho duenho) {
        duenhoServ.editDuenho(duenho);
        return "El duenho ha sido editado correctamente";
    }
    
    //endpoint READ un duenho
    @GetMapping ("duenho/traer/{id_duenho}")
    public Duenho getUnDuenho (@PathVariable Long id_duenho) {
        return duenhoServ.findDuenho(id_duenho);
    }
}
