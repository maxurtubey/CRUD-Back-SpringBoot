
package com.example.crud.controller;

import com.example.crud.DTO.EstudiosDTO;
import com.example.crud.DTO.Mensaje;
import com.example.crud.model.Estudios;
import com.example.crud.service.IEstudiosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/estudios"})
@CrossOrigin(origins = "http://localhost:4200")

public class Controladora {
    
    @Autowired
    private IEstudiosService estudiosServ;
        
    @GetMapping("/detalle/{id}")
    public ResponseEntity<Estudios> getById(@PathVariable("id") int id){
        if(!estudiosServ.existePorId(id))
            return new ResponseEntity(new Mensaje("No se encontro el resgitro"), HttpStatus.NOT_FOUND);
        Estudios educacion = estudiosServ.buscarEstudio(id);
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    
    @PostMapping("/agregar")
     public ResponseEntity<?> agregar(@RequestBody EstudiosDTO estDto){    
        Estudios educacion = new Estudios();
        educacion.setCentro(estDto.getCentro());
        educacion.setTitulo(estDto.getTitulo());
        educacion.setAnio_ingreso(estDto.getAnio_ingreso());
        educacion.setAnio_egreso(estDto.getAnio_egreso());
        estudiosServ.guardar(educacion);
        return new ResponseEntity(new Mensaje("El ítem fue incorporado"), HttpStatus.OK);
    }
    
    @GetMapping("/lista")
    public ResponseEntity<List<Estudios>> listarEstudios(){
        List<Estudios> list = estudiosServ.verEstudios();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
     @PutMapping("/editar/{id}")
    public ResponseEntity<?> editar(@PathVariable("id")int id, @RequestBody EstudiosDTO estDto){
        Estudios educacion = estudiosServ.buscarEstudio(id);
        educacion.setCentro(estDto.getCentro());
        educacion.setTitulo(estDto.getTitulo());
        educacion.setAnio_ingreso(estDto.getAnio_ingreso());
        educacion.setAnio_egreso(estDto.getAnio_egreso());
        estudiosServ.guardar(educacion);
        return new ResponseEntity(new Mensaje("Registro de Educacion Actualizado"), HttpStatus.OK);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void eliminar(@PathVariable int id){
        estudiosServ.borrarEstudio(id);
    }
    
}
