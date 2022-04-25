
package com.example.crud.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudios")
public class Estudios implements Serializable{
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "centro", length = 100, nullable = false)
    private String centro;
    
    @Column(name = "titulo", length = 100, nullable = false)
    private String titulo;
    
    @Column(name = "anio_ingreso", length = 4, nullable = false)
    private String anio_ingreso;
    
    @Column(name = "anio_egreso", length = 20, nullable = false)
    private String anio_egreso;

    public Estudios() {
    }

    public Estudios(int id, String centro, String titulo, String anio_ingreso, String anio_egreso) {
        this.id = id;
        this.centro = centro;
        this.titulo = titulo;
        this.anio_ingreso = anio_ingreso;
        this.anio_egreso = anio_egreso;
    }

    public Estudios(String centro, String titulo, String anio_ingreso, String anio_egreso) {
        this.centro = centro;
        this.titulo = titulo;
        this.anio_ingreso = anio_ingreso;
        this.anio_egreso = anio_egreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
