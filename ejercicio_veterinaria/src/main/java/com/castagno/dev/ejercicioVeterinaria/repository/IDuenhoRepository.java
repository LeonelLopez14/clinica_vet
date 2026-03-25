
package com.castagno.dev.ejercicioVeterinaria.repository;

import com.castagno.dev.ejercicioVeterinaria.model.Duenho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenhoRepository extends JpaRepository <Duenho, Long> {
    
}
