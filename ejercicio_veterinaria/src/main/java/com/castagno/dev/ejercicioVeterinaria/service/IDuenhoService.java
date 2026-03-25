
package com.castagno.dev.ejercicioVeterinaria.service;

import com.castagno.dev.ejercicioVeterinaria.model.Duenho;
import java.util.List;


public interface IDuenhoService {
    
    //metodo READ duenhos
    public List<Duenho> getDuenhos();
    
    //metodo CREATE duenhos
    public void saveDuenho(Duenho duenho);
    
    //metodo DELETE duenho
    public void deleteDuenho(Long id_duenho);
    
    //metodo UPDATE duenho
    public void editDuenho (Duenho duenho);
    
    //metodo FIND duenho
    public Duenho findDuenho (Long id_duenho);
    
    
}
