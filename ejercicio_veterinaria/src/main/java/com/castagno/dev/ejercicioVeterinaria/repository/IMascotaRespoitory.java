
package com.castagno.dev.ejercicioVeterinaria.repository;

import com.castagno.dev.ejercicioVeterinaria.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRespoitory extends JpaRepository <Mascota, Long>{
    
}
