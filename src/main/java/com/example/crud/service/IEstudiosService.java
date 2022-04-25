
package com.example.crud.service;

import com.example.crud.model.Estudios;
import java.util.List;

public interface IEstudiosService {
    
    public List<Estudios> verEstudios();
    
    public void editar(Estudios educacion);
    
    public Estudios buscarEstudio(int id);
    
    public void guardar(Estudios estud);
    
    public void borrarEstudio(int id);
    
    public boolean existePorId(int id);
    
}



