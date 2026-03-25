
package com.castagno.dev.ejercicioVeterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Duenho {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO) 
    private Long id_duenho;
    private Long dni;
    private String nombre_duenho;
    private String apellido_duenho;
    private Long celular;

    public Duenho() {
    }

    public Duenho(Long id_duenho, Long dni, String nombre_duenho, String apellido_duenho, Long celular) {
        this.id_duenho = id_duenho;
        this.dni = dni;
        this.nombre_duenho = nombre_duenho;
        this.apellido_duenho = apellido_duenho;
        this.celular = celular;
    }


    
    
}
