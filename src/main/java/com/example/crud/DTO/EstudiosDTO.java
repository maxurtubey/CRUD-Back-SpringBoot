
package com.example.crud.DTO;

import javax.validation.constraints.NotBlank;

public class EstudiosDTO {
    
    @NotBlank
    private String centro;
    @NotBlank
    private String titulo;
    @NotBlank
    private String anio_ingreso;
    @NotBlank
    private String anio_egreso;

    public EstudiosDTO() {
    }

    public EstudiosDTO(@NotBlank String centro,@NotBlank String titulo,@NotBlank String anio_ingreso,@NotBlank String anio_egreso) {
        this.centro = centro;
        this.titulo = titulo;
        this.anio_ingreso = anio_ingreso;
        this.anio_egreso = anio_egreso;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnio_ingreso() {
        return anio_ingreso;
    }

    public void setAnio_ingreso(String anio_ingreso) {
        this.anio_ingreso = anio_ingreso;
    }

    public String getAnio_egreso() {
        return anio_egreso;
    }

    public void setAnio_egreso(String anio_egreso) {
        this.anio_egreso = anio_egreso;
    }
        
}
