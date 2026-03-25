
package com.castagno.dev.ejercicioVeterinaria.service;

import com.castagno.dev.ejercicioVeterinaria.dto.MascotaDuenhoDTO;
import com.castagno.dev.ejercicioVeterinaria.model.Mascota;
import java.util.List;


public interface IMascotaService {
    
    //metodo READ masoctas
    public List<Mascota> getMascota();
    
    //metodo CREATE mascotas
    public void saveMascota(Mascota mascota);
    
    //metodo DELETE mascotas
    public void deleteMascota(Long id_mascota);
    
    //metodo UPDATE mascotas
    public void editMascota (Mascota mascota);
    
    //metodo FIND mascotas
    public Mascota findMascota (Long id_mascota);
    
    //metodo READ para PERROS Y CANICHES
    public List<Mascota> getMascotaPerroYCaniche();
    
    //metodos READ mascota y duenho
    public List<MascotaDuenhoDTO> getMascotaConDuenho();
}
