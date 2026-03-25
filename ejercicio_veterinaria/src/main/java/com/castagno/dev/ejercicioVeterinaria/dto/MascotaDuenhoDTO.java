
package com.castagno.dev.ejercicioVeterinaria.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MascotaDuenhoDTO {
    
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String nombre_duenho;
    private String apellido_duenho;

    public MascotaDuenhoDTO() {
    }

    public MascotaDuenhoDTO(String nombre_mascota, String especie, String raza, String nombre_duenho, String apellido_duenho) {
        this.nombre_mascota = nombre_mascota;
        this.especie = especie;
        this.raza = raza;
        this.nombre_duenho = nombre_duenho;
        this.apellido_duenho = apellido_duenho;
    }
    
    
}
