
package com.example.crud.repository;

import com.example.crud.model.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudiosRepositorio extends JpaRepository<Estudios, Integer>{

}
